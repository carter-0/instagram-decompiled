package androidx.appcompat.view.menu;

import X.2Yi;
import X.AnonymousClass0fD;
import X.AnonymousClass2Z3;
import X.AnonymousClass7TE;
import X.C13988Tno;
import X.C18934WDm;
import X.C20937X5f;
import X.DbS;
import X.DbT;
import X.DbV;
import X.DbW;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.instagram.android.R;

public class ListMenuItemView extends LinearLayout implements C20937X5f, AbsListView.SelectionBoundsAdjuster {
    public CheckBox A00;
    public ImageView A01;
    public LinearLayout A02;
    public RadioButton A03;
    public TextView A04;
    public C18934WDm A05;
    public int A06;
    public Context A07;
    public Drawable A08;
    public Drawable A09;
    public LayoutInflater A0A;
    public ImageView A0B;
    public ImageView A0C;
    public TextView A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;

    public void setIcon(Drawable drawable) {
        boolean z = true;
        if (!this.A0E) {
            z = false;
            if (!this.A0G) {
                return;
            }
        }
        if (this.A01 == null) {
            if (drawable != null || this.A0G) {
                ImageView imageView = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, this, false);
                this.A01 = imageView;
                LinearLayout linearLayout = this.A02;
                if (linearLayout != null) {
                    linearLayout.addView(imageView, 0);
                } else {
                    addView(imageView, 0);
                }
            } else {
                return;
            }
        }
        if (drawable != null || this.A0G) {
            ImageView imageView2 = this.A01;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.A01.getVisibility() != 0) {
                this.A01.setVisibility(0);
                return;
            }
            return;
        }
        this.A01.setVisibility(8);
    }

    private LayoutInflater getInflater() {
        LayoutInflater layoutInflater = this.A0A;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater A0D2 = DbV.A0D(this);
        this.A0A = A0D2;
        return A0D2;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.A0C;
        if (imageView != null) {
            imageView.setVisibility(DbW.A01(z ? 1 : 0));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CN5(X.C18934WDm r10, int r11) {
        /*
            r9 = this;
            r9.A05 = r10
            boolean r0 = r10.isVisible()
            int r0 = X.DbW.A01(r0)
            r9.setVisibility(r0)
            java.lang.CharSequence r0 = r10.getTitle()
            r9.setTitle(r0)
            boolean r0 = r10.isCheckable()
            r9.setCheckable(r0)
            X.WDk r1 = r10.A0A
            boolean r0 = r1.A0G()
            if (r0 == 0) goto L_0x0133
            boolean r0 = r1.A0F()
            if (r0 == 0) goto L_0x012f
            char r0 = r10.A00
        L_0x002b:
            if (r0 == 0) goto L_0x0133
            X.WDm r2 = r9.A05
            X.WDk r8 = r2.A0A
            boolean r0 = r8.A0G()
            if (r0 == 0) goto L_0x0133
            boolean r1 = r8.A0F()
            if (r1 == 0) goto L_0x012b
            char r0 = r2.A00
        L_0x003f:
            if (r0 == 0) goto L_0x0133
            r5 = 0
            android.widget.TextView r4 = r9.A04
            if (r1 == 0) goto L_0x0127
            char r7 = r2.A00
        L_0x0048:
            if (r7 != 0) goto L_0x0079
            java.lang.String r0 = ""
        L_0x004c:
            r4.setText(r0)
        L_0x004f:
            android.widget.TextView r0 = r9.A04
            int r0 = r0.getVisibility()
            if (r0 == r5) goto L_0x005c
            android.widget.TextView r0 = r9.A04
            r0.setVisibility(r5)
        L_0x005c:
            android.graphics.drawable.Drawable r0 = r10.getIcon()
            r9.setIcon(r0)
            boolean r0 = r10.isEnabled()
            r9.setEnabled(r0)
            boolean r0 = r10.hasSubMenu()
            r9.setSubMenuArrowVisible(r0)
            java.lang.CharSequence r0 = r10.getContentDescription()
            r9.setContentDescription(r0)
            return
        L_0x0079:
            android.content.Context r0 = r8.A0M
            android.content.res.Resources r6 = r0.getResources()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            boolean r0 = r0.hasPermanentMenuKey()
            if (r0 == 0) goto L_0x0098
            r0 = 2131951974(0x7f130166, float:1.9540378E38)
            java.lang.String r0 = r6.getString(r0)
            r3.append(r0)
        L_0x0098:
            boolean r0 = r8.A0F()
            if (r0 == 0) goto L_0x0123
            int r8 = r2.A03
        L_0x00a0:
            r0 = 2131951970(0x7f130162, float:1.954037E38)
            java.lang.String r2 = r6.getString(r0)
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r8 & r1
            if (r0 != r1) goto L_0x00b0
            r3.append(r2)
        L_0x00b0:
            r0 = 2131951966(0x7f13015e, float:1.9540361E38)
            java.lang.String r2 = r6.getString(r0)
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r8 & r1
            if (r0 != r1) goto L_0x00c0
            r3.append(r2)
        L_0x00c0:
            r0 = 2131951965(0x7f13015d, float:1.954036E38)
            java.lang.String r2 = r6.getString(r0)
            r1 = 2
            r0 = r8 & 2
            if (r0 != r1) goto L_0x00cf
            r3.append(r2)
        L_0x00cf:
            r0 = 2131951971(0x7f130163, float:1.9540372E38)
            java.lang.String r2 = r6.getString(r0)
            r1 = 1
            r0 = r8 & 1
            if (r0 != r1) goto L_0x00de
            r3.append(r2)
        L_0x00de:
            r0 = 2131951973(0x7f130165, float:1.9540376E38)
            java.lang.String r2 = r6.getString(r0)
            r1 = 4
            r0 = r8 & 4
            if (r0 != r1) goto L_0x00ed
            r3.append(r2)
        L_0x00ed:
            r0 = 2131951969(0x7f130161, float:1.9540368E38)
            java.lang.String r2 = r6.getString(r0)
            r1 = 8
            r0 = r8 & 8
            if (r0 != r1) goto L_0x00fd
            r3.append(r2)
        L_0x00fd:
            if (r7 == r1) goto L_0x0114
            r0 = 10
            if (r7 == r0) goto L_0x0118
            r0 = 32
            if (r7 == r0) goto L_0x0110
            r3.append(r7)
        L_0x010a:
            java.lang.String r0 = r3.toString()
            goto L_0x004c
        L_0x0110:
            r0 = 2131951972(0x7f130164, float:1.9540374E38)
            goto L_0x011b
        L_0x0114:
            r0 = 2131951967(0x7f13015f, float:1.9540363E38)
            goto L_0x011b
        L_0x0118:
            r0 = 2131951968(0x7f130160, float:1.9540365E38)
        L_0x011b:
            java.lang.String r0 = r6.getString(r0)
            r3.append(r0)
            goto L_0x010a
        L_0x0123:
            int r8 = r2.A04
            goto L_0x00a0
        L_0x0127:
            char r7 = r2.A01
            goto L_0x0048
        L_0x012b:
            char r0 = r2.A01
            goto L_0x003f
        L_0x012f:
            char r0 = r10.A01
            goto L_0x002b
        L_0x0133:
            r5 = 8
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.CN5(X.WDm, int):void");
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.A0B;
        if (imageView != null && imageView.getVisibility() == 0) {
            rect.top += C13988Tno.A0B(DbS.A0D(this.A0B), this.A0B.getHeight());
        }
    }

    public C18934WDm getItemData() {
        return this.A05;
    }

    public final void onMeasure(int i, int i2) {
        if (this.A01 != null && this.A0G) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = this.A01.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        CompoundButton compoundButton3;
        if (z || this.A03 != null || this.A00 != null) {
            if ((this.A05.A02 & 4) != 0) {
                if (this.A03 == null) {
                    RadioButton radioButton = (RadioButton) DbT.A0C(getInflater(), this, R.layout.abc_list_menu_item_radio);
                    this.A03 = radioButton;
                    LinearLayout linearLayout = this.A02;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.A03;
                compoundButton3 = this.A00;
                compoundButton2 = compoundButton3;
            } else {
                if (this.A00 == null) {
                    CheckBox checkBox = (CheckBox) DbT.A0C(getInflater(), this, R.layout.abc_list_menu_item_checkbox);
                    this.A00 = checkBox;
                    LinearLayout linearLayout2 = this.A02;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.A00;
                compoundButton2 = compoundButton;
                compoundButton3 = this.A03;
            }
            if (z) {
                compoundButton.setChecked(this.A05.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (compoundButton3 != null && compoundButton3.getVisibility() != 8) {
                    compoundButton3.setVisibility(8);
                    return;
                }
                return;
            }
            if (compoundButton2 != null) {
                compoundButton2.setVisibility(8);
            }
            RadioButton radioButton2 = this.A03;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.A05.A02 & 4) != 0) {
            if (this.A03 == null) {
                RadioButton radioButton = (RadioButton) DbT.A0C(getInflater(), this, R.layout.abc_list_menu_item_radio);
                this.A03 = radioButton;
                LinearLayout linearLayout = this.A02;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.A03;
        } else {
            if (this.A00 == null) {
                CheckBox checkBox = (CheckBox) DbT.A0C(getInflater(), this, R.layout.abc_list_menu_item_checkbox);
                this.A00 = checkBox;
                LinearLayout linearLayout2 = this.A02;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.A00;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.A0E = z;
        this.A0G = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        if (r3 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setGroupDividerEnabled(boolean r3) {
        /*
            r2 = this;
            android.widget.ImageView r1 = r2.A0B
            if (r1 == 0) goto L_0x0010
            boolean r0 = r2.A0F
            if (r0 != 0) goto L_0x000b
            r0 = 0
            if (r3 != 0) goto L_0x000d
        L_0x000b:
            r0 = 8
        L_0x000d:
            r1.setVisibility(r0)
        L_0x0010:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.setGroupDividerEnabled(boolean):void");
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        TextView textView2 = this.A0D;
        if (charSequence != null) {
            textView2.setText(charSequence);
            if (this.A0D.getVisibility() != 0) {
                textView = this.A0D;
                i = 0;
            } else {
                return;
            }
        } else {
            i = 8;
            if (textView2.getVisibility() != 8) {
                textView = this.A0D;
            } else {
                return;
            }
        }
        textView.setVisibility(i);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        2Yi A002 = 2Yi.A00(getContext(), attributeSet, AnonymousClass2Z3.A0H, i, 0);
        this.A08 = A002.A02(5);
        TypedArray typedArray = A002.A02;
        this.A06 = typedArray.getResourceId(1, -1);
        this.A0G = typedArray.getBoolean(7, false);
        this.A07 = context;
        this.A09 = A002.A02(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.A0F = obtainStyledAttributes.hasValue(0);
        typedArray.recycle();
        obtainStyledAttributes.recycle();
    }

    public final void onFinishInflate() {
        int A062 = AnonymousClass0fD.A06(-955915171);
        super.onFinishInflate();
        setBackground(this.A08);
        TextView A0d = AnonymousClass7TE.A0d(this, R.id.title);
        this.A0D = A0d;
        int i = this.A06;
        if (i != -1) {
            A0d.setTextAppearance(this.A07, i);
        }
        this.A04 = AnonymousClass7TE.A0d(this, R.id.shortcut);
        ImageView A0G2 = DbS.A0G(this, R.id.submenuarrow);
        this.A0C = A0G2;
        if (A0G2 != null) {
            A0G2.setImageDrawable(this.A09);
        }
        this.A0B = DbS.A0G(this, R.id.group_divider);
        this.A02 = (LinearLayout) findViewById(R.id.content);
        AnonymousClass0fD.A0D(-1280611747, A062);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }
}
