package mazizashari.kabakilab.data;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Typeface;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import mazizashari.kabakilab.Katalog.katalog1;
import mazizashari.kabakilab.Katalog.katalog10;
import mazizashari.kabakilab.Katalog.katalog11;
import mazizashari.kabakilab.Katalog.katalog12;
import mazizashari.kabakilab.Katalog.katalog13;
import mazizashari.kabakilab.Katalog.katalog14;
import mazizashari.kabakilab.Katalog.katalog15;
import mazizashari.kabakilab.Katalog.katalog16;
import mazizashari.kabakilab.Katalog.katalog17;
import mazizashari.kabakilab.Katalog.katalog18;
import mazizashari.kabakilab.Katalog.katalog19;
import mazizashari.kabakilab.Katalog.katalog2;
import mazizashari.kabakilab.Katalog.katalog20;
import mazizashari.kabakilab.Katalog.katalog21;
import mazizashari.kabakilab.Katalog.katalog22;
import mazizashari.kabakilab.Katalog.katalog23;
import mazizashari.kabakilab.Katalog.katalog24;
import mazizashari.kabakilab.Katalog.katalog25;
import mazizashari.kabakilab.Katalog.katalog26;
import mazizashari.kabakilab.Katalog.katalog27;
import mazizashari.kabakilab.Katalog.katalog28;
import mazizashari.kabakilab.Katalog.katalog29;
import mazizashari.kabakilab.Katalog.katalog3;
import mazizashari.kabakilab.Katalog.katalog30;
import mazizashari.kabakilab.Katalog.katalog31;
import mazizashari.kabakilab.Katalog.katalog32;
import mazizashari.kabakilab.Katalog.katalog33;
import mazizashari.kabakilab.Katalog.katalog34;
import mazizashari.kabakilab.Katalog.katalog35;
import mazizashari.kabakilab.Katalog.katalog36;
import mazizashari.kabakilab.Katalog.katalog37;
import mazizashari.kabakilab.Katalog.katalog38;
import mazizashari.kabakilab.Katalog.katalog39;
import mazizashari.kabakilab.Katalog.katalog4;
import mazizashari.kabakilab.Katalog.katalog40;
import mazizashari.kabakilab.Katalog.katalog41;
import mazizashari.kabakilab.Katalog.katalog42;
import mazizashari.kabakilab.Katalog.katalog43;
import mazizashari.kabakilab.Katalog.katalog44;
import mazizashari.kabakilab.Katalog.katalog45;
import mazizashari.kabakilab.Katalog.katalog46;
import mazizashari.kabakilab.Katalog.katalog47;
import mazizashari.kabakilab.Katalog.katalog48;
import mazizashari.kabakilab.Katalog.katalog49;
import mazizashari.kabakilab.Katalog.katalog5;
import mazizashari.kabakilab.Katalog.katalog50;
import mazizashari.kabakilab.Katalog.katalog51;
import mazizashari.kabakilab.Katalog.katalog52;
import mazizashari.kabakilab.Katalog.katalog53;
import mazizashari.kabakilab.Katalog.katalog54;
import mazizashari.kabakilab.Katalog.katalog55;
import mazizashari.kabakilab.Katalog.katalog56;
import mazizashari.kabakilab.Katalog.katalog57;
import mazizashari.kabakilab.Katalog.katalog58;
import mazizashari.kabakilab.Katalog.katalog59;
import mazizashari.kabakilab.Katalog.katalog6;
import mazizashari.kabakilab.Katalog.katalog60;
import mazizashari.kabakilab.Katalog.katalog61;
import mazizashari.kabakilab.Katalog.katalog62;
import mazizashari.kabakilab.Katalog.katalog63;
import mazizashari.kabakilab.Katalog.katalog64;
import mazizashari.kabakilab.Katalog.katalog65;
import mazizashari.kabakilab.Katalog.katalog66;
import mazizashari.kabakilab.Katalog.katalog67;
import mazizashari.kabakilab.Katalog.katalog68;
import mazizashari.kabakilab.Katalog.katalog69;
import mazizashari.kabakilab.Katalog.katalog7;
import mazizashari.kabakilab.Katalog.katalog8;
import mazizashari.kabakilab.Katalog.katalog9;
import mazizashari.kabakilab.ListReagen;
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

            Typeface custom_font = Typeface.createFromAsset(itemView.getContext().getAssets(),  "fonts/FRADMCN.TTF");

            if(position % 2 == 0) {
                boxReagen.setBackgroundColor(0xFFFFFFFF);
            }else{
                boxReagen.setBackgroundColor(0xFFFEF03B);
            }
            tv_no_reagen.setText(String.valueOf(position+1));
            tv_nama_reagen.setText(insect.namaReagen);

            String rumusKimia = insect.rumusKimia;
            if(rumusKimia.length() != 0) {
                String rumusSub = "" + rumusKimia.charAt(0);
                for (int i = 1; i < rumusKimia.length(); i++) {
                    if (rumusKimia.charAt(i - 1) != '.' && (rumusKimia.charAt(i) == '1' || rumusKimia.charAt(i) == '2' || rumusKimia.charAt(i) == '3'
                            || rumusKimia.charAt(i) == '4' || rumusKimia.charAt(i) == '5' || rumusKimia.charAt(i) == '6'
                            || rumusKimia.charAt(i) == '7' || rumusKimia.charAt(i) == '8' || rumusKimia.charAt(i) == '9')) {
                        rumusSub = rumusSub + "<sub><small>" + rumusKimia.charAt(i) + "</small></sub>";
                    } else {
                        rumusSub = rumusSub + rumusKimia.charAt(i);
                    }
                }
                tv_rumus_kimia.setText(Html.fromHtml(rumusSub));
            }else{
                tv_rumus_kimia.setText(rumusKimia);
            }

            tv_no_reagen.setTypeface(custom_font);
            tv_nama_reagen.setTypeface(custom_font);
            tv_rumus_kimia.setTypeface(custom_font);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent;
                    Context context = itemView.getContext();
                    if(insect.idReagen == 1) {
                        intent = new Intent(itemView.getContext(), katalog1.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 2) {
                        intent = new Intent(itemView.getContext(), katalog2.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 3) {
                        intent = new Intent(itemView.getContext(), katalog3.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 4) {
                        intent = new Intent(itemView.getContext(), katalog4.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 5) {
                        intent = new Intent(itemView.getContext(), katalog5.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 6) {
                        intent = new Intent(itemView.getContext(), katalog6.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 7) {
                        intent = new Intent(itemView.getContext(), katalog7.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 8) {
                        intent = new Intent(itemView.getContext(), katalog8.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 9) {
                        intent = new Intent(itemView.getContext(), katalog9.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 10) {
                        intent = new Intent(itemView.getContext(), katalog10.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 11) {
                        intent = new Intent(itemView.getContext(), katalog11.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 12) {
                        intent = new Intent(itemView.getContext(), katalog12.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 13) {
                        intent = new Intent(itemView.getContext(), katalog13.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 14) {
                        intent = new Intent(itemView.getContext(), katalog14.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 15) {
                        intent = new Intent(itemView.getContext(), katalog15.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 16) {
                        intent = new Intent(itemView.getContext(), katalog16.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 17) {
                        intent = new Intent(itemView.getContext(), katalog17.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 18) {
                        intent = new Intent(itemView.getContext(), katalog18.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 19) {
                        intent = new Intent(itemView.getContext(), katalog19.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 20) {
                        intent = new Intent(itemView.getContext(), katalog20.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 21) {
                        intent = new Intent(itemView.getContext(), katalog21.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 22) {
                        intent = new Intent(itemView.getContext(), katalog22.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 23) {
                        intent = new Intent(itemView.getContext(), katalog23.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 24) {
                        intent = new Intent(itemView.getContext(), katalog24.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 25) {
                        intent = new Intent(itemView.getContext(), katalog25.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 26) {
                        intent = new Intent(itemView.getContext(), katalog26.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 27) {
                        intent = new Intent(itemView.getContext(), katalog27.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 28) {
                        intent = new Intent(itemView.getContext(), katalog28.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 29) {
                        intent = new Intent(itemView.getContext(), katalog29.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 30) {
                        intent = new Intent(itemView.getContext(), katalog30.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 31) {
                        intent = new Intent(itemView.getContext(), katalog31.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 32) {
                        intent = new Intent(itemView.getContext(), katalog32.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 33) {
                        intent = new Intent(itemView.getContext(), katalog33.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 34) {
                        intent = new Intent(itemView.getContext(), katalog34.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 35) {
                        intent = new Intent(itemView.getContext(), katalog35.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 36) {
                        intent = new Intent(itemView.getContext(), katalog36.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 37) {
                        intent = new Intent(itemView.getContext(), katalog37.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 38) {
                        intent = new Intent(itemView.getContext(), katalog38.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 39) {
                        intent = new Intent(itemView.getContext(), katalog39.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 40) {
                        intent = new Intent(itemView.getContext(), katalog40.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 41) {
                        intent = new Intent(itemView.getContext(), katalog41.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 42) {
                        intent = new Intent(itemView.getContext(), katalog42.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 43) {
                        intent = new Intent(itemView.getContext(), katalog43.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 44) {
                        intent = new Intent(itemView.getContext(), katalog44.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 45) {
                        intent = new Intent(itemView.getContext(), katalog45.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 46) {
                        intent = new Intent(itemView.getContext(), katalog46.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if(insect.idReagen == 47) {
                        intent = new Intent(itemView.getContext(), katalog47.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity)context).finish();
                    }else if (insect.idReagen == 48) {
                        intent = new Intent(itemView.getContext(), katalog48.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity) context).finish();
                    } else if (insect.idReagen == 49) {
                        intent = new Intent(itemView.getContext(), katalog49.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity) context).finish();
                    } else if (insect.idReagen == 50) {
                        intent = new Intent(itemView.getContext(), katalog50.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity) context).finish();
                    } else if (insect.idReagen == 51) {
                        intent = new Intent(itemView.getContext(), katalog51.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity) context).finish();
                    } else if (insect.idReagen == 52) {
                        intent = new Intent(itemView.getContext(), katalog52.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity) context).finish();
                    } else if (insect.idReagen == 53) {
                        intent = new Intent(itemView.getContext(), katalog53.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity) context).finish();
                    } else if (insect.idReagen == 54) {
                        intent = new Intent(itemView.getContext(), katalog54.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity) context).finish();
                    } else if (insect.idReagen == 55) {
                        intent = new Intent(itemView.getContext(), katalog55.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity) context).finish();
                    } else if (insect.idReagen == 56) {
                        intent = new Intent(itemView.getContext(), katalog56.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity) context).finish();
                    } else if (insect.idReagen == 57) {
                        intent = new Intent(itemView.getContext(), katalog57.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity) context).finish();
                    } else if (insect.idReagen == 58) {
                        intent = new Intent(itemView.getContext(), katalog58.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity) context).finish();
                    } else if (insect.idReagen == 59) {
                        intent = new Intent(itemView.getContext(), katalog59.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity) context).finish();
                    } else if (insect.idReagen == 60) {
                        intent = new Intent(itemView.getContext(), katalog60.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity) context).finish();
                    } else if (insect.idReagen == 61) {
                        intent = new Intent(itemView.getContext(), katalog61.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity) context).finish();
                    } else if (insect.idReagen == 62) {
                        intent = new Intent(itemView.getContext(), katalog62.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity) context).finish();
                    } else if (insect.idReagen == 63) {
                        intent = new Intent(itemView.getContext(), katalog63.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity) context).finish();
                    } else if (insect.idReagen == 64) {
                        intent = new Intent(itemView.getContext(), katalog64.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity) context).finish();
                    } else if (insect.idReagen == 65) {
                        intent = new Intent(itemView.getContext(), katalog65.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity) context).finish();
                    } else if (insect.idReagen == 66) {
                        intent = new Intent(itemView.getContext(), katalog66.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity) context).finish();
                    } else if (insect.idReagen == 67) {
                        intent = new Intent(itemView.getContext(), katalog67.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity) context).finish();
                    } else if (insect.idReagen == 68) {
                        intent = new Intent(itemView.getContext(), katalog68.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity) context).finish();
                    } else if (insect.idReagen == 69) {
                        intent = new Intent(itemView.getContext(), katalog69.class);
                        itemView.getContext().startActivity(intent);
                        ((Activity) context).finish();
                    }

                    //intent.putExtra(InsectDetailsActivity.EXTRA_DATA, insect);

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
