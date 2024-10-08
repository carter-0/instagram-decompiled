package com.instagram.igds.components.textcell;

import X.0nA;
import X.0qQ;
import X.2Yo;
import X.2Yu;
import X.2eO;
import X.2eQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C358618bC;
import X.C62512Kh2;
import X.C66580MXl;
import X.C69258NiK;
import X.C69349Njo;
import X.C71382cm;
import X.C71402Ok1;
import X.C71409Ok8;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbY;
import X.JTT;
import X.U31;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgProgressBar;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsRadioButton;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsListCell extends LinearLayout {
    public View.OnClickListener A00;
    public ViewGroup A01;
    public FrameLayout A02;
    public IgProgressBar A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgTextView A06;
    public IgTextView A07;
    public IgImageView A08;
    public IgImageView A09;
    public IgImageView A0A;
    public IgImageView A0B;
    public IgdsRadioButton A0C;
    public IgdsCheckBox A0D;
    public IgdsCheckBox A0E;
    public IgdsSwitch A0F;
    public C69349Njo A0G;
    public boolean A0H;
    public CompoundButton A0I;
    public CharSequence A0J;
    public boolean A0K;
    public boolean A0L;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgdsListCell(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z;
        0qQ.A0B(context, 1);
        this.A0K = true;
        this.A0G = C69349Njo.TYPE_UNKNOWN;
        this.A0L = true;
        CompoundButton compoundButton = this.A0I;
        if (compoundButton != null) {
            z = compoundButton.isChecked();
        } else {
            z = false;
        }
        this.A0H = z;
        CompoundButton compoundButton2 = this.A0I;
        if (compoundButton2 != null) {
            compoundButton2.isEnabled();
        }
        View inflate = DbV.A0D(this).inflate(R.layout.igds_textcell_layout, this);
        C66580MXl.A1R(inflate);
        ViewGroup viewGroup = (ViewGroup) inflate;
        this.A01 = viewGroup;
        String str = "textCellView";
        if (viewGroup != null) {
            DbY.A0z(viewGroup);
            Resources resources = getResources();
            setMinimumHeight(DbS.A03(resources, R.dimen.abc_alert_dialog_button_dimen));
            ViewGroup viewGroup2 = this.A01;
            if (viewGroup2 != null) {
                0nA.A0Z(viewGroup2, resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
                ViewGroup viewGroup3 = this.A01;
                if (viewGroup3 != null) {
                    0nA.A0b(viewGroup3, resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
                    ViewGroup viewGroup4 = this.A01;
                    if (viewGroup4 != null) {
                        viewGroup4.setImportantForAccessibility(1);
                        ViewGroup viewGroup5 = this.A01;
                        if (viewGroup5 != null) {
                            viewGroup5.setDescendantFocusability(393216);
                            ViewGroup viewGroup6 = this.A01;
                            if (viewGroup6 != null) {
                                this.A02 = (FrameLayout) viewGroup6.requireViewById(R.id.textcell_add_on_button_container);
                                ViewGroup viewGroup7 = this.A01;
                                if (viewGroup7 != null) {
                                    this.A07 = DbT.A0a(viewGroup7, R.id.igds_textcell_title);
                                    ViewGroup viewGroup8 = this.A01;
                                    if (viewGroup8 != null) {
                                        this.A06 = DbT.A0a(viewGroup8, R.id.igds_textcell_subtitle);
                                        ViewGroup viewGroup9 = this.A01;
                                        if (viewGroup9 != null) {
                                            this.A0F = (IgdsSwitch) viewGroup9.requireViewById(R.id.igds_textcell_switch);
                                            ViewGroup viewGroup10 = this.A01;
                                            if (viewGroup10 != null) {
                                                this.A0C = (IgdsRadioButton) viewGroup10.requireViewById(R.id.igds_textcell_radio);
                                                ViewGroup viewGroup11 = this.A01;
                                                if (viewGroup11 != null) {
                                                    this.A03 = (IgProgressBar) viewGroup11.requireViewById(R.id.igds_textcell_progress);
                                                    ViewGroup viewGroup12 = this.A01;
                                                    if (viewGroup12 != null) {
                                                        this.A0D = (IgdsCheckBox) viewGroup12.requireViewById(R.id.igds_textcell_checkbox);
                                                        ViewGroup viewGroup13 = this.A01;
                                                        if (viewGroup13 != null) {
                                                            this.A09 = DbT.A0b(viewGroup13, R.id.igds_textcell_chevron);
                                                            ViewGroup viewGroup14 = this.A01;
                                                            if (viewGroup14 != null) {
                                                                this.A0A = DbT.A0b(viewGroup14, R.id.igds_textcell_dismiss);
                                                                ViewGroup viewGroup15 = this.A01;
                                                                if (viewGroup15 != null) {
                                                                    this.A0B = DbT.A0b(viewGroup15, R.id.igds_textcell_icon);
                                                                    ViewGroup viewGroup16 = this.A01;
                                                                    if (viewGroup16 != null) {
                                                                        this.A08 = DbT.A0b(viewGroup16, R.id.igds_textcell_badge);
                                                                        ViewGroup viewGroup17 = this.A01;
                                                                        if (viewGroup17 != null) {
                                                                            this.A04 = DbT.A0a(viewGroup17, R.id.igds_textcell_detail);
                                                                            ViewGroup viewGroup18 = this.A01;
                                                                            if (viewGroup18 != null) {
                                                                                this.A0E = (IgdsCheckBox) viewGroup18.requireViewById(R.id.igds_textcell_left_checkbox);
                                                                                ViewGroup viewGroup19 = this.A01;
                                                                                if (viewGroup19 != null) {
                                                                                    this.A05 = DbT.A0a(viewGroup19, R.id.igds_textcell_index);
                                                                                    if (attributeSet != null) {
                                                                                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A1V);
                                                                                        0qQ.A07(obtainStyledAttributes);
                                                                                        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                                                                                        if (resourceId != 0) {
                                                                                            A05(resourceId);
                                                                                        }
                                                                                        int resourceId2 = obtainStyledAttributes.getResourceId(2, 0);
                                                                                        if (resourceId2 != 0) {
                                                                                            A0I(AnonymousClass7TE.A16(context, resourceId2));
                                                                                        }
                                                                                        int resourceId3 = obtainStyledAttributes.getResourceId(1, 0);
                                                                                        if (resourceId3 != 0) {
                                                                                            A0H(AnonymousClass7TE.A16(context, resourceId3));
                                                                                        }
                                                                                        obtainStyledAttributes.recycle();
                                                                                    }
                                                                                    IgTextView igTextView = this.A06;
                                                                                    if (igTextView == null) {
                                                                                        str = "subtitleView";
                                                                                    } else {
                                                                                        igTextView.setImportantForAccessibility(2);
                                                                                        FrameLayout frameLayout = this.A02;
                                                                                        if (frameLayout == null) {
                                                                                            str = "rightAddOnContainer";
                                                                                        } else {
                                                                                            frameLayout.setImportantForAccessibility(4);
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A04() {
        String str;
        setEnabled(true);
        this.A0L = true;
        IgImageView igImageView = this.A0B;
        if (igImageView == null) {
            str = "iconView";
        } else {
            0nA.A0O(igImageView);
            IgTextView igTextView = this.A06;
            if (igTextView == null) {
                str = "subtitleView";
            } else {
                0nA.A0O(igTextView);
                IgImageView igImageView2 = this.A08;
                if (igImageView2 == null) {
                    str = "badgeView";
                } else {
                    0nA.A0O(igImageView2);
                    IgTextView igTextView2 = this.A04;
                    if (igTextView2 == null) {
                        str = "detailView";
                    } else {
                        0nA.A0O(igTextView2);
                        FrameLayout frameLayout = this.A02;
                        if (frameLayout == null) {
                            str = "rightAddOnContainer";
                        } else {
                            frameLayout.setOnClickListener((View.OnClickListener) null);
                            CompoundButton compoundButton = this.A0I;
                            if (compoundButton != null) {
                                compoundButton.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
                            }
                            IgTextView igTextView3 = this.A07;
                            if (igTextView3 == null) {
                                str = "titleView";
                            } else {
                                setContentDescription(igTextView3.getText());
                                setAccessibilityDelegate((View.AccessibilityDelegate) null);
                                A03();
                                return;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A09(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        Context context = getContext();
        A0A(drawable, DbV.A0n(context, 2Yu.A0B(context)));
    }

    public final void A0A(Drawable drawable, Integer num) {
        IgImageView igImageView = this.A0B;
        if (igImageView == null) {
            0qQ.A0F("iconView");
            throw AnonymousClass00P.createAndThrow();
        }
        igImageView.setVisibility(0);
        igImageView.setImageDrawable(drawable);
        if (num != null) {
            igImageView.setColorFilter(num.intValue());
        }
    }

    public final void A0C(View.OnClickListener onClickListener) {
        String str;
        0qQ.A0B(onClickListener, 0);
        setOnClickListener(onClickListener);
        IgTextView igTextView = this.A06;
        if (igTextView == null) {
            str = "subtitleView";
        } else {
            igTextView.setOnClickListener(new C71409Ok8(15, (Object) this, (Object) onClickListener));
            IgImageView igImageView = this.A08;
            if (igImageView == null) {
                str = "badgeView";
            } else {
                igImageView.setOnClickListener(onClickListener);
                IgTextView igTextView2 = this.A04;
                if (igTextView2 == null) {
                    str = "detailView";
                } else {
                    igTextView2.setOnClickListener(onClickListener);
                    FrameLayout frameLayout = this.A02;
                    if (frameLayout == null) {
                        str = "rightAddOnContainer";
                    } else {
                        frameLayout.setOnClickListener(onClickListener);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0F(C62512Kh2 kh2) {
        IgImageView igImageView;
        Context context;
        int i;
        IgImageView igImageView2;
        int i2;
        int i3;
        int A022 = DbU.A02(kh2, 0);
        if (A022 != 1) {
            if (A022 == 2) {
                igImageView2 = this.A08;
                if (igImageView2 != null) {
                    igImageView2.setImageResource(R.drawable.instagram_warning_pano_filled_24);
                    context = getContext();
                    i = R.color.activator_card_progress_bad;
                    DbU.A14(context, igImageView, i);
                }
            } else if (A022 != 3) {
                if (A022 == 0) {
                    igImageView = this.A08;
                    if (igImageView != null) {
                        i3 = R.drawable.blue_dot_medium;
                    }
                } else if (A022 == 4) {
                    igImageView = this.A08;
                    if (igImageView != null) {
                        i3 = R.drawable.red_dot_medium;
                    }
                } else {
                    throw AnonymousClass7TE.A1K();
                }
                igImageView.setImageResource(i3);
                igImageView.setColorFilter((ColorFilter) null);
            } else {
                igImageView2 = this.A08;
                if (igImageView2 != null) {
                    igImageView2.setImageResource(R.drawable.instagram_error_pano_filled_24);
                    context = getContext();
                    i2 = R.attr.igds_color_error_or_destructive;
                    i = 2Yu.A0H(context, i2);
                    DbU.A14(context, igImageView, i);
                }
            }
            0qQ.A0F("badgeView");
            throw AnonymousClass00P.createAndThrow();
        }
        igImageView2 = this.A08;
        if (igImageView2 != null) {
            igImageView2.setImageResource(R.drawable.instagram_circle_check_pano_filled_24);
            context = getContext();
            i2 = R.attr.igds_color_success;
            i = 2Yu.A0H(context, i2);
            DbU.A14(context, igImageView, i);
        }
        0qQ.A0F("badgeView");
        throw AnonymousClass00P.createAndThrow();
        igImageView.setVisibility(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007c, code lost:
        r2.setOnClickListener(new X.C71402Ok1((java.lang.Object) r5, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        X.0qQ.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009f, code lost:
        r0.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a2, code lost:
        r0 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a4, code lost:
        if (r0 == null) goto L_0x0009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a6, code lost:
        r0.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        setEnabled(r5.A0K);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0G(X.C69349Njo r6, boolean r7) {
        /*
            r5 = this;
            r4 = 0
            r5.A0K = r7
            com.instagram.igds.components.checkbox.IgdsCheckBox r0 = r5.A0E
            if (r0 != 0) goto L_0x0011
            java.lang.String r3 = "leftAlignedCheckBox"
        L_0x0009:
            X.0qQ.A0F(r3)
        L_0x000c:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0011:
            X.0nA.A0O(r0)
            r5.A03()
            int r0 = r6.ordinal()
            java.lang.String r3 = "rightAddOnContainer"
            switch(r0) {
                case 1: goto L_0x005f;
                case 2: goto L_0x0094;
                case 3: goto L_0x0041;
                case 4: goto L_0x0085;
                case 5: goto L_0x0026;
                case 6: goto L_0x002d;
                default: goto L_0x0020;
            }
        L_0x0020:
            boolean r0 = r5.A0K
            r5.setEnabled(r0)
            return
        L_0x0026:
            com.instagram.common.ui.base.IgProgressBar r0 = r5.A03
            if (r0 != 0) goto L_0x009f
            java.lang.String r1 = "igProgressBar"
            goto L_0x008b
        L_0x002d:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r5.A0A
            if (r0 != 0) goto L_0x0034
            java.lang.String r1 = "dismissView"
            goto L_0x008b
        L_0x0034:
            r0.setVisibility(r4)
            android.widget.FrameLayout r2 = r5.A02
            if (r2 == 0) goto L_0x0009
            r2.setVisibility(r4)
            r1 = 69
            goto L_0x007c
        L_0x0041:
            r5.setTextCellAccessibilityDelegate(r4)
            com.instagram.igds.components.checkbox.IgdsCheckBox r0 = r5.A0D
            java.lang.String r1 = "checkBox"
            if (r0 == 0) goto L_0x008b
            r5.A0I = r0
            r0.setVisibility(r4)
            android.widget.FrameLayout r2 = r5.A02
            if (r2 == 0) goto L_0x0009
            r2.setVisibility(r4)
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0020
            r1 = 68
            goto L_0x007c
        L_0x005f:
            r5.setTextCellAccessibilityDelegate(r4)
            com.instagram.igds.components.switchbutton.IgdsSwitch r0 = r5.A0F
            java.lang.String r1 = "igSwitch"
            if (r0 == 0) goto L_0x008b
            r5.A0I = r0
            r0.setVisibility(r4)
            android.widget.FrameLayout r2 = r5.A02
            if (r2 == 0) goto L_0x0009
            r2.setVisibility(r4)
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0020
            r1 = 67
        L_0x007c:
            X.Ok1 r0 = new X.Ok1
            r0.<init>((java.lang.Object) r5, (int) r1)
            r2.setOnClickListener(r0)
            goto L_0x0020
        L_0x0085:
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r5.A09
            if (r0 != 0) goto L_0x0090
            java.lang.String r1 = "chevronView"
        L_0x008b:
            X.0qQ.A0F(r1)
            goto L_0x000c
        L_0x0090:
            r0.setVisibility(r4)
            goto L_0x00a2
        L_0x0094:
            r5.setTextCellAccessibilityDelegate(r4)
            com.instagram.igds.components.button.IgdsRadioButton r0 = r5.A0C
            java.lang.String r1 = "igdsRadioButton"
            if (r0 == 0) goto L_0x008b
            r5.A0I = r0
        L_0x009f:
            r0.setVisibility(r4)
        L_0x00a2:
            android.widget.FrameLayout r0 = r5.A02
            if (r0 == 0) goto L_0x0009
            r0.setVisibility(r4)
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.textcell.IgdsListCell.A0G(X.Njo, boolean):void");
    }

    public final void A0H(CharSequence charSequence) {
        0qQ.A0B(charSequence, 0);
        if (!AnonymousClass7TF.A1Q(charSequence.length())) {
            IgTextView igTextView = this.A06;
            if (igTextView != null) {
                igTextView.setVisibility(0);
                igTextView.setText(charSequence);
                A00();
                return;
            }
        } else {
            IgTextView igTextView2 = this.A06;
            if (igTextView2 != null) {
                igTextView2.setVisibility(8);
                return;
            }
        }
        0qQ.A0F("subtitleView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0I(CharSequence charSequence) {
        0qQ.A0B(charSequence, 0);
        IgTextView igTextView = this.A07;
        if (igTextView == null) {
            0qQ.A0F("titleView");
            throw AnonymousClass00P.createAndThrow();
        }
        igTextView.setText(charSequence);
        A00();
    }

    public final void A0J(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        0qQ.A0B(charSequence, 0);
        this.A0J = charSequence2;
        String str = "detailView";
        if (!AnonymousClass7TF.A1Q(charSequence.length())) {
            A03();
            IgTextView igTextView = this.A04;
            if (igTextView != null) {
                igTextView.setText(charSequence);
                A00();
                igTextView.setVisibility(0);
                if (z) {
                    A0F(C62512Kh2.BLUE);
                    return;
                }
                return;
            }
        } else {
            IgTextView igTextView2 = this.A04;
            if (igTextView2 != null) {
                igTextView2.setVisibility(8);
                IgImageView igImageView = this.A08;
                if (igImageView == null) {
                    str = "badgeView";
                } else {
                    igImageView.setVisibility(8);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0K(CharSequence charSequence, boolean z) {
        0qQ.A0B(charSequence, 0);
        A0J(charSequence, charSequence, z);
    }

    public void setCheckBoxAlignmentContrib(C69258NiK niK) {
        0qQ.A0B(niK, 0);
        if (!(this.A0I instanceof IgdsCheckBox)) {
            throw AnonymousClass7TE.A0z("You cannot set CheckBoxAlignment until you specify the TextCell type as TextCellType.TYPE_CHECKBOX.Please call setTextCellType before calling setCheckBoxAlignment.");
        } else if (this.A0G == C69349Njo.TYPE_CHECKBOX) {
            FrameLayout frameLayout = this.A02;
            String str = "rightAddOnContainer";
            if (frameLayout != null) {
                0nA.A0O(frameLayout);
                A03();
                IgdsCheckBox igdsCheckBox = this.A0E;
                if (igdsCheckBox == null) {
                    str = "leftAlignedCheckBox";
                } else {
                    0nA.A0O(igdsCheckBox);
                    setTextCellAccessibilityDelegate(false);
                    if (niK == C69258NiK.START) {
                        this.A0I = igdsCheckBox;
                        igdsCheckBox.setVisibility(0);
                        return;
                    }
                    IgdsCheckBox igdsCheckBox2 = this.A0D;
                    str = "checkBox";
                    if (igdsCheckBox2 != null) {
                        this.A0I = igdsCheckBox2;
                        frameLayout.setVisibility(0);
                        igdsCheckBox2.setVisibility(0);
                        if (igdsCheckBox2.isEnabled()) {
                            frameLayout.setOnClickListener(new C71402Ok1((Object) this, 64));
                            return;
                        }
                        return;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void setCompoundButtonClickListener(View.OnClickListener onClickListener) {
        0qQ.A0B(onClickListener, 0);
        CompoundButton compoundButton = this.A0I;
        if (compoundButton != null) {
            compoundButton.setOnClickListener(onClickListener);
            return;
        }
        throw AnonymousClass7TE.A0z("You cannot set a listener until you specify the Textcell type.Please call setTextCellType before calling setOnCheckedChangeListener.");
    }

    public final void setTextCellType(C69349Njo njo) {
        0qQ.A0B(njo, 0);
        this.A0G = njo;
        A0G(njo, this.A0K);
    }

    private final void A00() {
        String str;
        IgTextView igTextView = this.A07;
        if (igTextView == null) {
            str = "titleView";
        } else {
            CharSequence text = igTextView.getText();
            IgTextView igTextView2 = this.A06;
            if (igTextView2 == null) {
                str = "subtitleView";
            } else {
                CharSequence text2 = igTextView2.getText();
                CharSequence charSequence = this.A0J;
                if (charSequence == null) {
                    IgTextView igTextView3 = this.A04;
                    if (igTextView3 == null) {
                        str = "detailView";
                    } else {
                        charSequence = igTextView3.getText();
                    }
                }
                setContentDescription(2eQ.A00(new CharSequence[]{text, text2, charSequence}));
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(IgdsListCell igdsListCell, boolean z) {
        CompoundButton compoundButton = igdsListCell.A0I;
        if (compoundButton != null) {
            igdsListCell.setTextCellAccessibilityDelegate(z);
            if (compoundButton instanceof IgdsSwitch) {
                IgdsSwitch igdsSwitch = igdsListCell.A0F;
                if (igdsSwitch == null) {
                    0qQ.A0F("igSwitch");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    igdsSwitch.setCheckedAnimated(z);
                }
            } else {
                compoundButton.setChecked(z);
            }
        }
    }

    public final void A03() {
        String str;
        0nA.A0O(this.A0I);
        IgdsSwitch igdsSwitch = this.A0F;
        if (igdsSwitch == null) {
            str = "igSwitch";
        } else {
            0nA.A0O(igdsSwitch);
            IgdsCheckBox igdsCheckBox = this.A0D;
            if (igdsCheckBox == null) {
                str = "checkBox";
            } else {
                0nA.A0O(igdsCheckBox);
                IgdsRadioButton igdsRadioButton = this.A0C;
                if (igdsRadioButton == null) {
                    str = "igdsRadioButton";
                } else {
                    0nA.A0O(igdsRadioButton);
                    IgImageView igImageView = this.A09;
                    if (igImageView == null) {
                        str = "chevronView";
                    } else {
                        0nA.A0O(igImageView);
                        IgProgressBar igProgressBar = this.A03;
                        if (igProgressBar == null) {
                            str = "igProgressBar";
                        } else {
                            0nA.A0O(igProgressBar);
                            IgImageView igImageView2 = this.A0A;
                            if (igImageView2 == null) {
                                str = "dismissView";
                            } else {
                                0nA.A0O(igImageView2);
                                return;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A05(int i) {
        if (i != 0) {
            IgImageView igImageView = this.A0B;
            if (igImageView == null) {
                0qQ.A0F("iconView");
                throw AnonymousClass00P.createAndThrow();
            }
            igImageView.setImageResource(i);
            Context context = getContext();
            DbU.A14(context, igImageView, 2Yu.A0B(context));
            igImageView.setVisibility(0);
        }
    }

    public final void A06(int i) {
        IgTextView igTextView = this.A07;
        if (igTextView == null) {
            0qQ.A0F("titleView");
            throw AnonymousClass00P.createAndThrow();
        }
        igTextView.setText(i);
        A00();
    }

    public final void A07(int i, int i2) {
        IgTextView igTextView = this.A06;
        if (igTextView == null) {
            0qQ.A0F("subtitleView");
            throw AnonymousClass00P.createAndThrow();
        }
        igTextView.setTextAppearance(i);
        DbT.A17(getContext(), igTextView, i2);
    }

    public final void A08(int i, int i2) {
        IgTextView igTextView = this.A07;
        if (igTextView == null) {
            0qQ.A0F("titleView");
            throw AnonymousClass00P.createAndThrow();
        }
        igTextView.setTextAppearance(i);
        DbT.A17(getContext(), igTextView, i2);
    }

    public final void A0B(MovementMethod movementMethod) {
        IgTextView igTextView = this.A06;
        if (igTextView == null) {
            0qQ.A0F("subtitleView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            igTextView.setMovementMethod(movementMethod);
        }
    }

    public final void A0D(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        CompoundButton compoundButton = this.A0I;
        if (compoundButton != null) {
            compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
            if (compoundButton.isEnabled() && this.A0L) {
                A0C(new C71402Ok1((Object) this, 65));
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0z("You cannot set a listener until you specify the Textcell type.Please call setTextCellType before calling setOnCheckedChangeListener.");
    }

    public final void A0E(C358618bC r3) {
        if (this.A0I instanceof IgdsSwitch) {
            IgdsSwitch igdsSwitch = this.A0F;
            if (igdsSwitch == null) {
                0qQ.A0F("igSwitch");
                throw AnonymousClass00P.createAndThrow();
            }
            igdsSwitch.A07 = r3;
            if (igdsSwitch.isEnabled()) {
                A0C(new C71402Ok1((Object) this, 66));
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0z("You cannot set a ToggleListener until you specify the Textcell type as TextCellType.TYPE_SWITCH.Please call setTextCellType before calling setSwitchToggleListener.");
    }

    public final void A0L(boolean z) {
        CompoundButton compoundButton = this.A0I;
        if (compoundButton != null) {
            setTextCellAccessibilityDelegate(z);
            if (compoundButton instanceof IgdsSwitch) {
                IgdsSwitch igdsSwitch = this.A0F;
                if (igdsSwitch == null) {
                    0qQ.A0F("igSwitch");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    igdsSwitch.setCheckedAnimated(z);
                }
            } else {
                compoundButton.setChecked(z);
            }
        }
    }

    public final IgTextView getDetailView() {
        IgTextView igTextView = this.A04;
        if (igTextView != null) {
            return igTextView;
        }
        0qQ.A0F("detailView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final IgTextView getSubtitleView() {
        IgTextView igTextView = this.A06;
        if (igTextView != null) {
            return igTextView;
        }
        0qQ.A0F("subtitleView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C69349Njo getTextCellType() {
        return this.A0G;
    }

    public final ViewGroup getTextCellView() {
        ViewGroup viewGroup = this.A01;
        if (viewGroup != null) {
            return viewGroup;
        }
        0qQ.A0F("textCellView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final IgTextView getTitleView() {
        IgTextView igTextView = this.A07;
        if (igTextView != null) {
            return igTextView;
        }
        0qQ.A0F("titleView");
        throw AnonymousClass00P.createAndThrow();
    }

    @Deprecated(message = "Please do not use this method. We are deprecating this functionality. Use [IgdsListCell#setEnabled(boolean)] instead.")
    public final void setButtonUIEnabled(boolean z) {
        this.A0K = z;
        CompoundButton compoundButton = this.A0I;
        if (compoundButton != null) {
            setEnabled(z);
            FrameLayout frameLayout = this.A02;
            if (frameLayout == null) {
                0qQ.A0F("rightAddOnContainer");
                throw AnonymousClass00P.createAndThrow();
            }
            frameLayout.setEnabled(z);
            if (!(compoundButton instanceof IgdsSwitch)) {
                float f = 0.3f;
                if (z) {
                    f = 1.0f;
                }
                compoundButton.setAlpha(f);
            }
        }
    }

    public final void setChecked(boolean z) {
        this.A0H = z;
        A01(this, z);
    }

    public void setIconColorContrib(int i) {
        IgImageView igImageView = this.A0B;
        if (igImageView == null) {
            0qQ.A0F("iconView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            DbU.A14(getContext(), igImageView, i);
        }
    }

    public final void setIndex(int i) {
        IgTextView igTextView = this.A05;
        if (igTextView == null) {
            0qQ.A0F("indexView");
            throw AnonymousClass00P.createAndThrow();
        }
        igTextView.setVisibility(0);
        String format = String.format("%d.", Arrays.copyOf(AnonymousClass7TF.A1b(i + 1), 1));
        0qQ.A07(format);
        igTextView.setText(format);
    }

    public final void setSubtitleMaxLine(int i) {
        if (i > 0) {
            IgTextView igTextView = this.A06;
            if (igTextView == null) {
                0qQ.A0F("subtitleView");
                throw AnonymousClass00P.createAndThrow();
            }
            igTextView.setMaxLines(i);
            igTextView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public final void setTitleMaxLines(int i) {
        if (i > 0) {
            IgTextView igTextView = this.A07;
            if (igTextView == null) {
                0qQ.A0F("titleView");
                throw AnonymousClass00P.createAndThrow();
            }
            igTextView.setMaxLines(i);
            igTextView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    public void setTitleTextColorContrib(int i) {
        IgTextView igTextView = this.A07;
        if (igTextView == null) {
            0qQ.A0F("titleView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            DbT.A17(getContext(), igTextView, i);
        }
    }

    public final void setTitleTextSize(float f) {
        IgTextView igTextView = this.A07;
        if (igTextView == null) {
            0qQ.A0F("titleView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            igTextView.setTextSize(0, f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r3 == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setToggleIcon(boolean r3) {
        /*
            r2 = this;
            android.widget.CompoundButton r1 = r2.A0I
            boolean r0 = r1 instanceof com.instagram.igds.components.switchbutton.IgdsSwitch
            if (r0 == 0) goto L_0x0014
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r1
            if (r1 == 0) goto L_0x0014
            boolean r0 = com.instagram.igds.components.switchbutton.IgdsSwitch.A0O
            if (r0 == 0) goto L_0x0011
            r0 = 1
            if (r3 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r1.A0A = r0
        L_0x0014:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.textcell.IgdsListCell.setToggleIcon(boolean):void");
    }

    /* access modifiers changed from: private */
    public final void setTextCellAccessibilityDelegate(boolean z) {
        if (2eO.A00(getContext())) {
            setAccessibilityDelegate(new U31(this, z));
        }
    }

    public void setEnabled(boolean z) {
        String str;
        super.setEnabled(z);
        this.A0K = z;
        IgTextView igTextView = this.A06;
        if (igTextView == null) {
            str = "subtitleView";
        } else {
            igTextView.setEnabled(z);
            IgImageView igImageView = this.A08;
            if (igImageView == null) {
                str = "badgeView";
            } else {
                igImageView.setEnabled(z);
                IgTextView igTextView2 = this.A04;
                if (igTextView2 == null) {
                    str = "detailView";
                } else {
                    igTextView2.setEnabled(z);
                    IgImageView igImageView2 = this.A0B;
                    if (igImageView2 == null) {
                        str = "iconView";
                    } else {
                        igImageView2.setEnabled(z);
                        CompoundButton compoundButton = this.A0I;
                        if (compoundButton != null) {
                            compoundButton.setEnabled(z);
                            FrameLayout frameLayout = this.A02;
                            if (frameLayout == null) {
                                str = "rightAddOnContainer";
                            } else {
                                frameLayout.setEnabled(z);
                                if (!(compoundButton instanceof IgdsSwitch) && !2Yo.A01(true)) {
                                    float f = 0.3f;
                                    if (z) {
                                        f = 1.0f;
                                    }
                                    compoundButton.setAlpha(f);
                                    return;
                                }
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setCheckedChangeEnabled(boolean z) {
        this.A0L = z;
    }

    public final void setToggleEnabledClick(boolean z) {
        setEnabled(z);
    }

    public /* synthetic */ IgdsListCell(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsListCell(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
