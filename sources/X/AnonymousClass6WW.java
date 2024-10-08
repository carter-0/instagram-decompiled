package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgProgressBar;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.List;

/* renamed from: X.6WW  reason: invalid class name */
public abstract class AnonymousClass6WW {
    public static final void A00(UserSession userSession, C317646nb r13, C317546nR r14, C249693kD r15) {
        C255783ui r3;
        String str;
        String str2;
        int i;
        0qQ.A0B(r14, 0);
        List Bkd = r15.Bkd(AnonymousClass3WT.JOIN_CHAT);
        if (Bkd == null || (r3 = (C255783ui) 00k.A0J(Bkd)) == null || r3.A0x == null || !r15.CWu()) {
            r14.A06.setVisibility(8);
            return;
        }
        C19469WaH A0A = r3.A0A();
        if (A0A != null) {
            r14.A05 = A0A;
            C252063oV r2 = r14.A06;
            if (!r2.CVM()) {
                View view = r2.getView();
                r14.A01 = view;
                if (view != null) {
                    IgSimpleImageView igSimpleImageView = (IgSimpleImageView) view.requireViewById(R.id.chat_sticker_view);
                    r14.A03 = igSimpleImageView;
                    str = "stickerView";
                    if (igSimpleImageView != null) {
                        Context context = igSimpleImageView.getContext();
                        C19469WaH waH = r14.A05;
                        str2 = "model";
                        if (waH != null) {
                            String str3 = waH.A00.A0M;
                            if (str3 == null) {
                                str3 = "";
                            }
                            Integer valueOf = Integer.valueOf(waH.A01());
                            Integer num = waH.A00.A0A;
                            if (num != null) {
                                i = num.intValue();
                            } else {
                                i = 0;
                            }
                            igSimpleImageView.setContentDescription(context.getString(2131955071, new Object[]{str3, valueOf, Integer.valueOf(i)}));
                            View view2 = r14.A01;
                            if (view2 != null) {
                                r14.A00 = view2.requireViewById(R.id.chat_sticker_button_view);
                                View view3 = r14.A01;
                                if (view3 != null) {
                                    r14.A02 = (IgProgressBar) view3.requireViewById(R.id.loading_spinner);
                                    View view4 = r14.A00;
                                    str = "buttonView";
                                    if (view4 != null) {
                                        2eS.A04(view4, AnonymousClass05K.A01);
                                        View view5 = r14.A00;
                                        if (view5 != null) {
                                            C19469WaH waH2 = r14.A05;
                                            if (waH2 != null) {
                                                View view6 = r14.A01;
                                                if (view6 != null) {
                                                    Context context2 = view6.getContext();
                                                    0qQ.A07(context2);
                                                    view5.setContentDescription(waH2.A03(context2, userSession));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        0qQ.A0F(str2);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F("stickerContainerView");
                throw AnonymousClass00P.createAndThrow();
            }
            IgSimpleImageView igSimpleImageView2 = r14.A03;
            str = "stickerView";
            if (igSimpleImageView2 != null) {
                Context context3 = igSimpleImageView2.getContext();
                0qQ.A07(context3);
                C19469WaH waH3 = r14.A05;
                if (waH3 == null) {
                    str2 = "model";
                } else {
                    C369668v8 r1 = new C369668v8(context3, userSession, waH3);
                    r14.A04 = r1;
                    IgSimpleImageView igSimpleImageView3 = r14.A03;
                    if (igSimpleImageView3 != null) {
                        str = "stickerDrawable";
                        igSimpleImageView3.setImageDrawable(r1);
                        View view7 = r14.A00;
                        str2 = "buttonView";
                        if (view7 != null) {
                            C369668v8 r0 = r14.A04;
                            if (r0 != null) {
                                0nA.A0V(view7, r0.A02.A00);
                                View view8 = r14.A00;
                                if (view8 != null) {
                                    C369668v8 r02 = r14.A04;
                                    if (r02 != null) {
                                        0nA.A0f(view8, r02.A00);
                                        View view9 = r14.A00;
                                        if (view9 != null) {
                                            AnonymousClass0fU.A00(new C56775IBy(r13, r14, r3, r15), view9);
                                            View view10 = r14.A01;
                                            if (view10 == null) {
                                                str2 = "stickerContainerView";
                                            } else {
                                                0nA.A0q(view10, new C57951Ij6(userSession, r14, r3, r15));
                                                r2.setVisibility(0);
                                                IgProgressBar igProgressBar = r14.A02;
                                                if (igProgressBar == null) {
                                                    str2 = "loadingSpinner";
                                                } else {
                                                    igProgressBar.setVisibility(4);
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
                0qQ.A0F(str2);
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        throw new IllegalStateException("Required value was null.");
    }
}
