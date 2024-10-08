package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.NIh  reason: case insensitive filesystem */
public final class C68444NIh extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "DirectTextCardViewerFragment";
    public ViewGroup A00;
    public IgTextView A01;
    public AnonymousClass3E6 A02;
    public NVH A03;
    public C67746Mtz A04;
    public OVY A05;
    public C74508Pw3 A06;
    public OI1 A07;
    public AnonymousClass9HC A08;
    public AnonymousClass7L2 A09;
    public AnonymousClass2Ep A0A;
    public C333537Zi A0B;
    public DirectThreadKey A0C;
    public User A0D;
    public String A0E;
    public final P1B A0F = new P1B(this);
    public final P1E A0G = new P1E(this);
    public final AnonymousClass0eM A0H = AnonymousClass1YB.A00(new C73656PhV(this, 9));
    public final AnonymousClass0eM A0I = C227642jf.A02(this);
    public final 1wn A0J = C71932OtG.A00(this, 10);
    public final C252213ok A0K = new C72237Oz5(this, 4);

    public final String getModuleName() {
        return "direct_text_card_viewer_fragment";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) {
        /*
            r17 = this;
            r12 = 0
            r4 = r18
            X.0qQ.A0B(r4, r12)
            r0 = r19
            r5 = r17
            super.onViewCreated(r4, r0)
            r0 = 2131436055(0x7f0b2217, float:1.849397E38)
            android.view.ViewGroup r0 = X.DbU.A0C(r4, r0)
            r5.A00 = r0
            r0 = 2131431889(0x7f0b11d1, float:1.848552E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r4, r0)
            r5.A01 = r0
            X.OI1 r6 = r5.A07
            r3 = 0
            if (r6 != 0) goto L_0x002e
            java.lang.String r6 = "reactionManager"
        L_0x0026:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x002e:
            X.P14 r2 = r6.A08
            r11 = 1
            X.0qQ.A0B(r2, r11)
            r0 = 2131429665(0x7f0b0921, float:1.848101E38)
            X.2eb r1 = X.DbY.A0T(r4, r0)
            X.Nbg r0 = new X.Nbg
            r0.<init>(r1, r2)
            r6.A03 = r0
            r0 = 2131429633(0x7f0b0901, float:1.8480944E38)
            android.view.View r0 = r4.requireViewById(r0)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r0
            r6.A00 = r0
            X.3E5 r1 = X.AnonymousClass3E4.A01(r5, r12, r12)
            r5.A02 = r1
            X.3ok r0 = r5.A0K
            r1.A9Y(r0)
            X.Mtz r0 = r5.A04
            java.lang.String r6 = "viewModel"
            if (r0 == 0) goto L_0x0026
            X.2Fk r2 = r0.A00
            r1 = 41
            X.PqX r0 = new X.PqX
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r5)
            X.Dba.A15(r5, r2, r0, r1)
            android.os.Bundle r1 = r5.mArguments
            if (r1 == 0) goto L_0x0074
            java.lang.String r0 = "card_gallery_currently_viewing_item_id"
            java.lang.String r3 = r1.getString(r0)
        L_0x0074:
            r5.A0E = r3
            if (r3 == 0) goto L_0x0081
            X.Mtz r0 = r5.A04
            if (r0 == 0) goto L_0x0026
            X.05G r0 = r0.A08
            r0.Epw(r3)
        L_0x0081:
            X.0eM r2 = r5.A0I
            java.lang.String r3 = X.DbU.A0u(r2)
            X.2Ep r1 = r5.A0A
            r0 = 0
            if (r1 == 0) goto L_0x0157
            X.3Te r1 = X.C66580MXl.A0b(r1)
            if (r1 == 0) goto L_0x0094
            java.lang.String r0 = r1.A07
        L_0x0094:
            boolean r0 = X.0qQ.A0K(r3, r0)
            java.lang.String r6 = "null cannot be cast to non-null type android.view.ViewGroup"
            r1 = 0
            if (r0 == 0) goto L_0x010d
            r0 = 2131434988(0x7f0b1dec, float:1.8491805E38)
            android.view.ViewStub r0 = X.JTR.A0X(r4, r0)
            android.view.View r7 = r0.inflate()
            X.0qQ.A0C(r7, r6)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r0 = 2131440518(0x7f0b3386, float:1.8503022E38)
            android.view.View r0 = X.AnonymousClass7TF.A0G(r7, r0)
            r0.requestFocus()
            X.0nA.A0S(r0)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r2)
            X.P1E r1 = r5.A0G
            X.3E6 r0 = r5.A02
            if (r0 != 0) goto L_0x00c8
            java.lang.String r6 = "keyboardHeightChangeDetector"
            goto L_0x0026
        L_0x00c8:
            X.P1C r8 = new X.P1C
            r8.<init>(r7, r3, r0, r1)
            r5.A06 = r8
            r10 = 31
            X.9IC r9 = new X.9IC
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r8.Ed3(r9)
            X.7L2 r0 = r5.A09
            if (r0 != 0) goto L_0x00e6
            java.lang.String r6 = "threadTheme"
            goto L_0x0026
        L_0x00e6:
            X.7L0 r0 = r0.A07
            r8.ADf(r0)
            X.0lg r7 = X.AnonymousClass7TF.A0L(r2, r12)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36319407396953447(0x81084f00591d67, double:3.03187771212383E-306)
            boolean r1 = X.182.A06(r3, r7, r0)
            X.7Zi r0 = r5.A0B
            if (r0 != 0) goto L_0x0102
            java.lang.String r6 = "sendMessageManager"
            goto L_0x0026
        L_0x0102:
            r8.Epd(r0, r1)
            com.instagram.common.ui.base.IgTextView r3 = r5.A01
            if (r3 == 0) goto L_0x0129
            r0 = 2131960089(0x7f132119, float:1.9556837E38)
            goto L_0x0152
        L_0x010d:
            X.2Ep r0 = r5.A0A
            if (r0 == 0) goto L_0x0157
            X.3Te r0 = X.C66580MXl.A0b(r0)
            if (r0 == 0) goto L_0x0119
            java.lang.String r1 = r0.A08
        L_0x0119:
            com.instagram.common.ui.base.IgTextView r3 = r5.A01
            if (r3 == 0) goto L_0x0129
            if (r1 == 0) goto L_0x014f
            r0 = 2131960087(0x7f132117, float:1.9556833E38)
            java.lang.String r0 = X.DbV.A0z(r5, r1, r0)
        L_0x0126:
            r3.setText(r0)
        L_0x0129:
            r0 = 2131434986(0x7f0b1dea, float:1.8491801E38)
            android.view.ViewStub r0 = X.JTR.A0X(r4, r0)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r2)
            android.view.View r2 = r0.inflate()
            X.0qQ.A0C(r2, r6)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            X.P1B r1 = r5.A0F
            X.OVY r0 = new X.OVY
            r0.<init>(r2, r3, r1)
            r5.A05 = r0
            android.view.ViewGroup r0 = r0.A02
            r0.setVisibility(r12)
            A00(r4, r5)
            return
        L_0x014f:
            r0 = 2131960088(0x7f132118, float:1.9556835E38)
        L_0x0152:
            java.lang.String r0 = r5.getString(r0)
            goto L_0x0126
        L_0x0157:
            java.lang.String r6 = "thread"
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68444NIh.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(View view, C68444NIh nIh) {
        String str;
        C69303Nj4 nj4;
        int A072;
        String string;
        int i;
        NVH nvh = nIh.A03;
        if (nvh != null) {
            N3F n3f = nvh.A01;
            User user = nIh.A0D;
            Integer num = n3f.A04;
            if (user != null) {
                DbU.A1S(nIh, DbX.A0b(view, R.id.profile_picture), user);
            }
            TextView A0R = AnonymousClass7TG.A0R(view, R.id.card_timestamp);
            if (num != null) {
                i = 0;
                A0R.setText(1G0.A05(AnonymousClass7TE.A0S(A0R), (double) num.intValue(), false));
            } else {
                i = 8;
            }
            A0R.setVisibility(i);
            AnonymousClass7TG.A0R(view, R.id.response).setText(n3f.A06);
            OI1 oi1 = nIh.A07;
            if (oi1 == null) {
                str = "reactionManager";
            } else {
                oi1.A01 = nvh;
                C68957Nbg nbg = oi1.A03;
                str = "reactionsPillViewHolder";
                if (nbg != null) {
                    C68955Nbe nbe = nvh.A03;
                    AnonymousClass4DH r4 = oi1.A05;
                    nbg.A03(r4, nbe);
                    C68957Nbg nbg2 = oi1.A03;
                    if (nbg2 != null) {
                        nbg2.BJd().setElevation(2.13116531E9f);
                        if (oi1.A02 == null) {
                            PA5 pa5 = new PA5(oi1);
                            P9X p9x = new P9X(r4);
                            TouchInterceptorFrameLayout touchInterceptorFrameLayout = oi1.A00;
                            if (touchInterceptorFrameLayout != null) {
                                C68853NZl nZl = new C68853NZl(touchInterceptorFrameLayout, p9x, pa5);
                                oi1.A02 = nZl;
                                nZl.A00 = oi1.A01;
                                TouchInterceptorFrameLayout touchInterceptorFrameLayout2 = oi1.A00;
                                if (touchInterceptorFrameLayout2 != null) {
                                    touchInterceptorFrameLayout2.setOnTouchListener(nZl);
                                }
                            }
                            str = "cardView";
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.row_thread_composer_edittext);
        if (A0d != null) {
            User user2 = nIh.A0D;
            if (user2 != null) {
                string = DbV.A0z(nIh, user2.B8Q(), 2131960526);
            } else {
                string = nIh.getString(2131960525);
            }
            A0d.setHint(string);
        }
        User user3 = nIh.A0D;
        if (user3 != null) {
            String id = user3.getId();
            AnonymousClass0eM r1 = nIh.A0I;
            boolean A0K2 = 0qQ.A0K(id, DbU.A0u(r1));
            ArrayList A1C = AnonymousClass7TE.A1C();
            if (A0K2) {
                nj4 = C69303Nj4.DELETE;
            } else {
                AnonymousClass9HW A002 = AnonymousClass9HV.A00(AnonymousClass7TE.A0l(r1));
                AnonymousClass2Ep r0 = nIh.A0A;
                C254763t0 r12 = null;
                if (r0 != null) {
                    String C6C = r0.C6C();
                    if (C6C != null) {
                        r12 = C66580MXl.A0g(C6C);
                    }
                    if (A002.A00(r12, 7)) {
                        A1C.add(C69303Nj4.REMOVE);
                    }
                    nj4 = C69303Nj4.REPORT;
                }
                str = "thread";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            A1C.add(nj4);
            OVY ovy = nIh.A05;
            str = "actionBarConfigurer";
            Long l = null;
            if (ovy != null) {
                ovy.A01(A1C);
                OVY ovy2 = nIh.A05;
                if (ovy2 != null) {
                    MessagingUser A003 = MessagingUser.A00(user3);
                    ImageUrl Bh3 = user3.Bh3();
                    String B8Q = user3.B8Q();
                    NVH nvh2 = nIh.A03;
                    if (nvh2 != null) {
                        l = Long.valueOf(TimeUnit.MILLISECONDS.toMicros(nvh2.A00));
                    }
                    AnonymousClass2Ep r02 = nIh.A0A;
                    if (r02 != null) {
                        boolean CVE = r02.CVE();
                        ovy2.A00 = A003;
                        IgImageView igImageView = ovy2.A07;
                        igImageView.setUrl(Bh3, nIh);
                        igImageView.setVisibility(0);
                        IgTextView igTextView = ovy2.A06;
                        if (A0K2) {
                            B8Q = igImageView.getContext().getString(2131976687);
                        }
                        igTextView.setText(B8Q);
                        igTextView.setVisibility(0);
                        if (l != null) {
                            IgTextView igTextView2 = ovy2.A05;
                            igTextView2.setVisibility(0);
                            igTextView2.setText(1G0.A05(AnonymousClass7TE.A0S(igTextView2), (double) (l.longValue() / 1000000), false));
                        } else {
                            ovy2.A05.setVisibility(4);
                        }
                        if (CVE) {
                            A072 = R.color.grey_0;
                        } else {
                            A072 = 2Yu.A07(ovy2.A02.getContext());
                        }
                        Context context = ovy2.A02.getContext();
                        int color = context.getColor(A072);
                        2dZ r13 = ovy2.A03;
                        r13.A0V(color);
                        igTextView.setTextColor(color);
                        r13.ENd(context.getDrawable(R.color.fds_transparent));
                        return;
                    }
                    str = "thread";
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0I);
    }

    public final void onCreate(Bundle bundle) {
        C254743sy r0;
        Throwable th;
        int i;
        Integer num;
        String A0t;
        int A022 = AnonymousClass0fD.A02(-1643733105);
        C68444NIh.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str = null;
        if (bundle2 != null) {
            r0 = C67002Mga.A00(bundle2, "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
        } else {
            r0 = null;
        }
        DirectThreadKey directThreadKey = (DirectThreadKey) r0;
        if (directThreadKey != null) {
            this.A0C = directThreadKey;
            AnonymousClass0eM r4 = this.A0I;
            2Dr A002 = 1bJ.A00(AnonymousClass7TE.A0l(r4));
            DirectThreadKey directThreadKey2 = this.A0C;
            if (directThreadKey2 != null) {
                AnonymousClass3U9 A032 = 2Dr.A03(A002, directThreadKey2);
                if (A032 != null) {
                    this.A0A = A032;
                    AnonymousClass9HD r3 = AnonymousClass9HC.A1b;
                    UserSession A0l = AnonymousClass7TE.A0l(r4);
                    Parcelable.Creator creator = Capabilities.CREATOR;
                    0sn r1 = 0sn.A00;
                    this.A08 = C66581MXm.A0X(A0l, r3, r1);
                    Context requireContext = requireContext();
                    AnonymousClass9HC A0X = C66581MXm.A0X(AnonymousClass7TE.A0l(r4), r3, r1);
                    AnonymousClass2Ep r02 = this.A0A;
                    if (r02 != null) {
                        if (r02.CVE()) {
                            num = AnonymousClass05K.A0N;
                        } else {
                            num = AnonymousClass05K.A00;
                        }
                        AnonymousClass2Ep r03 = this.A0A;
                        if (r03 != null) {
                            this.A09 = C329927Kt.A00.A01(requireContext, A0X, r03.C5v(), num);
                            UserSession A0l2 = AnonymousClass7TE.A0l(r4);
                            DirectThreadKey directThreadKey3 = this.A0C;
                            if (directThreadKey3 != null) {
                                AnonymousClass2Ep r04 = this.A0A;
                                if (r04 != null) {
                                    this.A07 = new OI1(this, A0l2, directThreadKey3, r04.C6a());
                                    this.A0B = C333527Zh.A00(AnonymousClass7TE.A0l(r4));
                                    UserSession A0l3 = AnonymousClass7TE.A0l(r4);
                                    DirectThreadKey directThreadKey4 = this.A0C;
                                    if (directThreadKey4 != null) {
                                        Bundle bundle3 = this.mArguments;
                                        if (bundle3 == null || (A0t = C66580MXl.A0t(bundle3)) == null) {
                                            th = AnonymousClass7TE.A0z("Required value was null.");
                                            i = 1724811491;
                                        } else {
                                            Bundle bundle4 = this.mArguments;
                                            if (bundle4 != null) {
                                                str = bundle4.getString("message_id");
                                            }
                                            this.A04 = new NNB(A0l3, directThreadKey4, A0t, str).create(C67746Mtz.class);
                                            AnonymousClass0fD.A09(-1310996034, A022);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    0qQ.A0F("thread");
                    throw AnonymousClass00P.createAndThrow();
                }
                th = AnonymousClass7TE.A0z("Required value was null.");
                i = 1005591701;
            }
            0qQ.A0F("threadKey");
            throw AnonymousClass00P.createAndThrow();
        }
        th = C66580MXl.A0p();
        i = -631003165;
        AnonymousClass0fD.A09(i, A022);
        throw th;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1949198457);
        0qQ.A0B(layoutInflater, 0);
        C68444NIh.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.intermediate_card_viewer, viewGroup, false);
        AnonymousClass0fD.A09(658556358, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1435249335);
        super.onDestroy();
        AnonymousClass3E6 r1 = this.A02;
        if (r1 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.EEH(this.A0K);
        AnonymousClass0fD.A09(1391905972, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-151903950);
        super.onDestroyView();
        this.A00 = null;
        this.A01 = null;
        AnonymousClass0fD.A09(-1276497441, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1296903597);
        C68444NIh.super.onPause();
        AnonymousClass3E6 r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.onStop();
        C74508Pw3 pw3 = this.A06;
        if (pw3 != null) {
            pw3.EEj();
        }
        DbX.A0R(this.A0I).A02(this.A0J, C71898Osg.class);
        AnonymousClass0fD.A09(-1085930531, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(37755745);
        super.onResume();
        AnonymousClass3E6 r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        JTP.A18(this, r0);
        C74508Pw3 pw3 = this.A06;
        if (pw3 != null) {
            pw3.AAP();
        }
        DbX.A0R(this.A0I).A01(this.A0J, C71898Osg.class);
        AnonymousClass0fD.A09(-1124682832, A022);
    }
}
