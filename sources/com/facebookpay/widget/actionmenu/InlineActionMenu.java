package com.facebookpay.widget.actionmenu;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.C11409SSh;
import X.C18674VwX;
import X.C51967G9n;
import X.DbY;
import X.RH2;
import X.SRn;
import X.SSH;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;

public final class InlineActionMenu extends FrameLayout {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public final int A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InlineActionMenu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A03 = DbY.A01(context);
        this.A04 = context.getResources().getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        View.inflate(context, R.layout.fbpay_ui_inline_action_menu, this);
        this.A01 = AnonymousClass7TE.A0d(this, R.id.fbpay_inline_action_menu_edit_view);
        this.A02 = AnonymousClass7TE.A0d(this, R.id.fbpay_inline_action_menu_remove_view);
        this.A00 = AnonymousClass7TE.A0d(this, R.id.fbpay_inline_action_menu_divider_view);
        TextView textView = this.A01;
        String str = "editView";
        if (textView != null) {
            textView.setText(2131962207);
            TextView textView2 = this.A01;
            if (textView2 != null) {
                RH2 rh2 = RH2.A04;
                SRn.A02(textView2, rh2);
                TextView textView3 = this.A01;
                if (textView3 != null) {
                    C11409SSh.A02(textView3, 4, 11, 11, 4);
                    TextView textView4 = this.A02;
                    str = "removeView";
                    if (textView4 != null) {
                        textView4.setText(2131962208);
                        TextView textView5 = this.A02;
                        if (textView5 != null) {
                            SRn.A02(textView5, rh2);
                            TextView textView6 = this.A02;
                            if (textView6 != null) {
                                C11409SSh.A02(textView6, 4, 11, 11, 4);
                                TextView textView7 = this.A00;
                                str = "dividerView";
                                if (textView7 != null) {
                                    textView7.setText("|");
                                    TextView textView8 = this.A00;
                                    if (textView8 != null) {
                                        SRn.A02(textView8, RH2.A14);
                                        TextView textView9 = this.A00;
                                        if (textView9 != null) {
                                            Integer valueOf = Integer.valueOf(this.A03);
                                            Integer A0k = C51967G9n.A0k();
                                            SSH.A03(textView9, valueOf, valueOf, A0k, A0k);
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
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setEditAccessibility(String str) {
        0qQ.A0B(str, 0);
        TextView textView = this.A01;
        if (textView == null) {
            0qQ.A0F("editView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            C18674VwX.A01(textView, AnonymousClass05K.A01, str);
        }
    }

    public final void setRemoveAccessibility(String str) {
        0qQ.A0B(str, 0);
        TextView textView = this.A02;
        if (textView == null) {
            0qQ.A0F("removeView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            C18674VwX.A01(textView, AnonymousClass05K.A01, str);
        }
    }

    public final void A00() {
        String str;
        TextView textView = this.A01;
        if (textView == null) {
            str = "editView";
        } else {
            textView.setVisibility(8);
            TextView textView2 = this.A02;
            if (textView2 == null) {
                str = "removeView";
            } else {
                textView2.setVisibility(8);
                TextView textView3 = this.A00;
                if (textView3 == null) {
                    str = "dividerView";
                } else {
                    textView3.setVisibility(8);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A01() {
        String str;
        TextView textView = this.A01;
        if (textView == null) {
            str = "editView";
        } else {
            textView.setVisibility(0);
            TextView textView2 = this.A02;
            if (textView2 == null) {
                str = "removeView";
            } else {
                textView2.setVisibility(8);
                TextView textView3 = this.A00;
                if (textView3 == null) {
                    str = "dividerView";
                } else {
                    textView3.setVisibility(8);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setEditComponentListener(View.OnClickListener onClickListener) {
        TextView textView = this.A01;
        if (textView == null) {
            0qQ.A0F("editView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            textView.setOnClickListener(onClickListener);
        }
    }

    public final void setRemoveComponentListener(View.OnClickListener onClickListener) {
        TextView textView = this.A02;
        if (textView == null) {
            0qQ.A0F("removeView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            textView.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InlineActionMenu(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InlineActionMenu(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }
}
