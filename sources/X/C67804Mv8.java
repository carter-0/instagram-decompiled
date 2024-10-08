package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.List;

/* renamed from: X.Mv8  reason: case insensitive filesystem */
public final class C67804Mv8 extends 2Rw {
    public C17774Vfl A00;
    public boolean A01;
    public final List A02 = AnonymousClass7TE.A1C();

    public final void onBindViewHolder(C249703kE r11, int i) {
        ImageView imageView;
        String str;
        CharSequence charSequence;
        0qQ.A0B(r11, 0);
        View view = r11.itemView;
        Context context = view.getContext();
        int itemViewType = getItemViewType(i);
        int i2 = 0;
        if (itemViewType == 0) {
            TextView textView = (TextView) view;
            Object obj = this.A02.get(i);
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.ui.menu.ButtonItem");
            C67293MlS mlS = (C67293MlS) obj;
            int i3 = mlS.A02;
            if (i3 != 0) {
                textView.setText(i3);
            } else {
                textView.setText(mlS.A04);
            }
            int i4 = mlS.A09;
            if (i4 != 0) {
                textView.setId(i4);
            }
            DbT.A17(context, textView, mlS.A08);
            if (i == getItemCount() - 1) {
                i2 = AnonymousClass7TH.A01(context);
            }
            0nA.A0T(textView, i2);
            if (this.A00 != null) {
                2eS.A01(textView);
                C71404Ok3.A01(textView, this, i, 5);
            }
        } else if (itemViewType != 1) {
            ColorStateList colorStateList = null;
            if (itemViewType != 2) {
                Object obj2 = this.A02.get(i);
                if (itemViewType != 3) {
                    0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.ui.menu.IgdsListCellItem");
                    OIM oim = (OIM) obj2;
                    IgdsListCell igdsListCell = ((C67920Mx6) r11).A00;
                    igdsListCell.A0I(oim.A0E);
                    String str2 = oim.A0D;
                    if (str2 instanceof CharSequence) {
                        igdsListCell.A0H(str2);
                    }
                    Integer num = oim.A05;
                    if (num != null) {
                        igdsListCell.A05(num.intValue());
                    }
                    Integer num2 = oim.A0B;
                    Integer num3 = oim.A0A;
                    if (!(num2 == null || num3 == null)) {
                        igdsListCell.A08(num2.intValue(), num3.intValue());
                    }
                    Integer num4 = oim.A09;
                    Integer num5 = oim.A07;
                    if (!(num4 == null || num5 == null)) {
                        igdsListCell.A07(num4.intValue(), num5.intValue());
                    }
                    String str3 = oim.A0C;
                    if (!(str3 == null || str3.length() == 0)) {
                        igdsListCell.A0K(str3, false);
                        igdsListCell.setTextCellType(C69349Njo.TYPE_CHEVRON);
                    }
                    if (oim.A01 != null) {
                        2eS.A01(igdsListCell);
                        igdsListCell.A0C(new C71344Oit(i, 5, oim, this));
                    }
                    View.OnClickListener onClickListener = oim.A00;
                    if (onClickListener != null) {
                        igdsListCell.setTextCellType(C69349Njo.TYPE_DISMISS);
                        igdsListCell.A00 = onClickListener;
                        return;
                    }
                    return;
                }
                0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.ui.menu.ArrowItem");
                C71065Oak oak = (C71065Oak) obj2;
                C67954Mxe mxe = (C67954Mxe) r11;
                View A0F = JTO.A0F(mxe);
                int i5 = oak.A06;
                TextView textView2 = mxe.A01;
                if (i5 != 0) {
                    charSequence = context.getString(i5);
                } else {
                    charSequence = oak.A09;
                }
                textView2.setText(charSequence);
                textView2.setTextColor(textView2.getTextColors().withAlpha((int) (oak.A00 * 255.0f)));
                if (this.A00 != null) {
                    2eS.A01(textView2);
                    C71404Ok3.A01(A0F, this, i, 7);
                }
                int i6 = oak.A05;
                if (i6 == -1 || i6 == 0) {
                    imageView = mxe.A00;
                    imageView.setVisibility(8);
                    return;
                }
                imageView = mxe.A00;
                imageView.setImageResource(i6);
                DbU.A14(context, imageView, 2Yu.A0B(context));
                imageView.setAlpha(oak.A00);
            } else {
                Object obj3 = this.A02.get(i);
                0qQ.A0C(obj3, "null cannot be cast to non-null type com.instagram.ui.menu.ButtonItem");
                C67293MlS mlS2 = (C67293MlS) obj3;
                My9 my9 = (My9) r11;
                View A0F2 = JTO.A0F(my9);
                int i7 = mlS2.A02;
                TextView textView3 = my9.A02;
                if (i7 != 0) {
                    str = context.getString(i7);
                } else {
                    str = mlS2.A04;
                }
                textView3.setText(str);
                boolean z = mlS2.A06;
                View view2 = my9.A00;
                if (z) {
                    view2.setVisibility(0);
                } else {
                    view2.setVisibility(8);
                }
                int i8 = mlS2.A09;
                if (i8 != 0) {
                    my9.itemView.setId(i8);
                }
                int i9 = mlS2.A08;
                int color = context.getColor(i9);
                ColorStateList A022 = 02K.A02(context, i9);
                if (A022 != null) {
                    colorStateList = A022.withAlpha((int) (mlS2.A07 * 255.0f));
                }
                textView3.setTextColor(colorStateList);
                imageView = my9.A01;
                imageView.setColorFilter(color);
                imageView.setAlpha(mlS2.A07);
                if (this.A00 != null) {
                    2eS.A01(textView3);
                    if (mlS2.A05) {
                        C71404Ok3.A01(A0F2, this, i, 6);
                    }
                }
                int i10 = mlS2.A00;
                if (i10 != -1) {
                    imageView.setImageResource(i10);
                }
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
        } else {
            C66581MXm.A1B(JTO.A0F(r11), -1, 1);
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater;
        int i2;
        0qQ.A0B(viewGroup, 0);
        if (i != 0) {
            if (i == 1) {
                layoutInflater = DbV.A0D(viewGroup);
                i2 = R.layout.bottom_sheet_divider;
                View inflate = layoutInflater.inflate(i2, viewGroup, false);
                int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                0qQ.A0B(inflate, 1);
                return new C249703kE(inflate);
            } else if (i == 2) {
                LayoutInflater A0D = DbV.A0D(viewGroup);
                boolean z = this.A01;
                int i4 = R.layout.action_sheet_row_with_icon;
                if (z) {
                    i4 = R.layout.action_sheet_row_with_icon_v2;
                }
                return new My9(A0D.inflate(i4, viewGroup, false));
            } else if (i == 3) {
                return new C67954Mxe(DbV.A0D(viewGroup).inflate(R.layout.row_arrow_item, viewGroup, false));
            } else {
                if (i == 4) {
                    return new C67920Mx6(C66581MXm.A0d(AnonymousClass7TE.A0S(viewGroup)));
                }
                if (i == 5) {
                    return new C67955Mxf(DbV.A0D(viewGroup).inflate(R.layout.action_sheet_row_with_notes, viewGroup, false));
                }
            }
        }
        layoutInflater = DbV.A0D(viewGroup);
        i2 = R.layout.action_sheet_row;
        View inflate2 = layoutInflater.inflate(i2, viewGroup, false);
        int i32 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0B(inflate2, 1);
        return new C249703kE(inflate2);
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-236603859);
        int size = this.A02.size();
        AnonymousClass0fD.A0A(-2022765063, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        int i2;
        int A03 = AnonymousClass0fD.A03(-578241912);
        Object obj = this.A02.get(i);
        if (obj instanceof C70944OSr) {
            i2 = 1;
        } else if (obj instanceof C71065Oak) {
            i2 = 3;
        } else if (obj instanceof OIM) {
            i2 = 4;
        } else {
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.ui.menu.ButtonItem");
            i2 = 0;
            if (((C67293MlS) obj).A00 != -1) {
                i2 = 2;
            }
        }
        AnonymousClass0fD.A0A(1718189415, A03);
        return i2;
    }
}
