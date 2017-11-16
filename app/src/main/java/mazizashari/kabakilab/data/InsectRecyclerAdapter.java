package mazizashari.kabakilab.data;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import mazizashari.kabakilab.Katalog.katalog2;
import mazizashari.kabakilab.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * RecyclerView adapter extended with project-specific required methods.
 */

public class InsectRecyclerAdapter extends
        RecyclerView.Adapter<InsectRecyclerAdapter.InsectHolder> {

    /* ViewHolder for each insect item */
    public class InsectHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.boxReagen)
        LinearLayout boxReagen;

        @BindView(R.id.tv_no_reagen)
        TextView tv_no_reagen;

        @BindView(R.id.tv_nama_reagen)
        TextView tv_nama_reagen;

        @BindView(R.id.tv_rumus_kimia)
        TextView tv_rumus_kimia;

        public InsectHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        private void bind(final Insect insect, final int position) {
            if(position % 2 == 0) {
                boxReagen.setBackgroundColor(0xFFFEEACA);
            }else{
                boxReagen.setBackgroundColor(0xFFFFFFFF);
            }
            tv_no_reagen.setText(String.valueOf(position+1));
            tv_nama_reagen.setText(insect.namaReagen);
            tv_rumus_kimia.setText(insect.rumusKimia);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(itemView.getContext(), katalog2.class);
                    //intent.putExtra(InsectDetailsActivity.EXTRA_DATA, insect);
                    itemView.getContext().startActivity(intent);
                }
            });
        }
    }

    private Cursor mCursor;

    public InsectRecyclerAdapter(Cursor mCursor) {
        this.mCursor = mCursor;
    }

    @Override
    public InsectHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new InsectHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.list_reagen_item, parent, false
                )
        );
    }

    @Override
    public void onBindViewHolder(InsectHolder holder, int position) {
        Insect insect = getItem(position);
        holder.bind(insect, position);
    }

    @Override
    public int getItemCount() {
        return mCursor.getCount();
    }

    /**
     * Return the {@link Insect} represented by this item in the adapter.
     *
     * @param position Adapter item position.
     *
     * @return A new {@link Insect} filled with this position's attributes
     *
     * @throws IllegalArgumentException if position is out of the adapter's bounds.
     */
    public Insect getItem(int position) {
        if (position < 0 || position >= getItemCount()) {
            throw new IllegalArgumentException("Item position is out of adapter's range");
        } else if (mCursor.moveToPosition(position)) {
            return new Insect(mCursor);
        }
        return null;
    }
}
