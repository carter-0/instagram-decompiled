package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.direct.ui.countdowntimer.CountdownTimerPill;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/* renamed from: X.NKp  reason: case insensitive filesystem */
public final class C68496NKp extends MYR implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "DirectDailyPromptsResponseListFragment";
    public int A00;
    public IgTextView A01;
    public C66930MfP A02;
    public C69309NjA A03;
    public AnonymousClass7H6 A04;
    public AnonymousClass2Ep A05;
    public CountdownTimerPill A06;
    public DirectShareTarget A07;
    public DirectThreadKey A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public List A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public final AnonymousClass0eM A0I = C227642jf.A02(this);
    public final AnonymousClass0eM A0J = AnonymousClass0eN.A01(new C73921Pm1(this, 23));
    public final AnonymousClass0eM A0K;
    public final 1wn A0L = C71932OtG.A00(this, 31);
    public final String A0M = __redex_internal_original_name;

    public static final void A02(C68496NKp nKp, C16677UzD uzD, String str, String str2) {
        String str3;
        C68496NKp nKp2 = nKp;
        FragmentActivity requireActivity = nKp.requireActivity();
        UserSession A0l = AnonymousClass7TE.A0l(nKp.A0I);
        DirectPromptTypes directPromptTypes = DirectPromptTypes.DAILY_PROMPT;
        String str4 = nKp.A0B;
        if (str4 == null) {
            str3 = "messageId";
        } else {
            String str5 = nKp.A0C;
            if (str5 == null) {
                str3 = "threadId";
            } else {
                C71128OdR.A03(requireActivity, nKp2, A0l, directPromptTypes, C14068TpH.IGD_PROMPT_V2_GRID_VIEW, uzD, str2, str4, str, str5);
                return;
            }
        }
        0qQ.A0F(str3);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.2tF, java.lang.Object] */
    public final Collection getDefinitions() {
        AnonymousClass0eM r3 = this.A0I;
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        C329967Kx r9 = C250563lf.A06(requireContext(), C66584MXp.A0M(AnonymousClass9HC.A1b, r3)).A04;
        AnonymousClass0eM r5 = this.A0K;
        return 0sr.A1P(new C232232tF[]{new NQD(this, A0l, r9, new OE1(AnonymousClass7TE.A0l(r3), new C72518P9b(this, 3), (C67743Mtw) r5.getValue()), (C67743Mtw) r5.getValue()), new Object(), new C68615NPl(AnonymousClass7TE.A0l(r3)), new C66610MYw(((C67743Mtw) r5.getValue()).A05, R.layout.direct_empty_view)});
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        this.A06 = (CountdownTimerPill) view2.requireViewById(R.id.countdown_timer);
        this.A01 = DbT.A0a(view2, R.id.add_response_button);
        2dY.A01(new C71397Ojw(this, 68), DbX.A0I(view2, R.id.action_bar_container)).A0X(new FTS(this, 2));
        DbX.A0R(this.A0I).A01(this.A0L, C71898Osg.class);
        AnonymousClass03j.A00(DbV.A0G(this).getDecorView(), new C71492Olh(view2, 2));
        addOnScrollListener(new C3251871j(getRecyclerView().A0D, new C72693PFx(this, 6), C3251771i.A0A, false, false));
        07U r6 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHF(view2, viewLifecycleOwner, r6, this, (AnonymousClass4D7) null, 36), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (X.0qQ.A0K(X.DbU.A0u(r11.A0I), r12) != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A00(X.C68496NKp r11, java.lang.String r12, java.lang.String r13, boolean r14) {
        /*
            X.0eM r0 = r11.A0J
            java.lang.Object r2 = r0.getValue()
            X.9HW r2 = (X.AnonymousClass9HW) r2
            java.lang.String r0 = r11.A0C
            if (r0 != 0) goto L_0x0014
            X.C66580MXl.A18()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0014:
            X.3t0 r1 = X.C66580MXl.A0g(r0)
            r0 = 68
            boolean r0 = r2.A00(r1, r0)
            if (r0 != 0) goto L_0x002d
            X.0eM r0 = r11.A0I
            java.lang.String r0 = X.DbU.A0u(r0)
            boolean r0 = X.0qQ.A0K(r0, r12)
            r4 = 0
            if (r0 == 0) goto L_0x002e
        L_0x002d:
            r4 = 1
        L_0x002e:
            X.0eM r1 = r11.A0I
            java.lang.String r0 = X.DbU.A0u(r1)
            boolean r3 = X.C51966G9m.A1a(r0, r12)
            android.content.Context r5 = r11.requireContext()
            java.lang.String r0 = X.DbU.A0u(r1)
            boolean r2 = X.0qQ.A0K(r0, r12)
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            if (r14 == 0) goto L_0x0063
            r7 = 0
            r1 = 48
            X.Phi r8 = new X.Phi
            r8.<init>(r13, r11, r1)
            r9 = 2131958827(0x7f131c2b, float:1.9554277E38)
            r10 = 2131238164(0x7f081d14, float:1.8092599E38)
            java.lang.Boolean r6 = X.AnonymousClass7TE.A0u()
            X.8rI r1 = X.C71127OdQ.A04(r5, r6, r7, r8, r9, r10)
            r0.add(r1)
        L_0x0063:
            if (r4 == 0) goto L_0x0080
            java.lang.Integer r7 = X.C66581MXm.A0m(r5)
            r1 = 2
            X.Phl r8 = new X.Phl
            r8.<init>(r11, r13, r1, r2)
            r9 = 2131958900(0x7f131c74, float:1.9554425E38)
            r10 = 2131238196(0x7f081d34, float:1.8092664E38)
            java.lang.Boolean r6 = X.AnonymousClass7TE.A0u()
            X.8rI r1 = X.C71127OdQ.A04(r5, r6, r7, r8, r9, r10)
            r0.add(r1)
        L_0x0080:
            if (r3 == 0) goto L_0x009e
            java.lang.Integer r7 = X.C66581MXm.A0m(r5)
            r1 = 26
            X.G2n r8 = new X.G2n
            r8.<init>((java.lang.Object) r11, (java.lang.String) r13, (java.lang.String) r12, (int) r1)
            r9 = 2131972171(0x7f13504b, float:1.9581342E38)
            r10 = 2131238715(0x7f081f3b, float:1.8093717E38)
            java.lang.Boolean r6 = X.AnonymousClass7TE.A0u()
            X.8rI r1 = X.C71127OdQ.A04(r5, r6, r7, r8, r9, r10)
            r0.add(r1)
        L_0x009e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68496NKp.A00(X.NKp, java.lang.String, java.lang.String, boolean):java.util.ArrayList");
    }

    public static final void A01(View view, C68496NKp nKp, List list) {
        if (list != null) {
            C355148Ov A0c = C66581MXm.A0c(nKp.requireContext(), AnonymousClass7TE.A0l(nKp.A0I), (Integer) null, list, false);
            if (A0c.getContentView() != null) {
                A0c.showAsDropDown(view, 0, 0);
            }
        }
    }

    public final String getModuleName() {
        return this.A0M;
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(C74178PqK.A00(this, 43));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0I);
    }

    public final boolean onBackPressed() {
        AnonymousClass7H6 r0 = this.A04;
        if (r0 != null) {
            return r0.A0h();
        }
        0qQ.A0F("mediaViewerController");
        throw AnonymousClass00P.createAndThrow();
    }

    public C68496NKp() {
        C73921Pm1 pm1 = new C73921Pm1(this, 24);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, C73921Pm1.A00(C73921Pm1.A00(this, 20), 21));
        this.A0K = DbS.A0I(C73921Pm1.A00(A002, 22), pm1, new C73667Phg(13, (Object) null, A002), DbS.A0z(C67743Mtw.class));
    }

    public final void onCreate(Bundle bundle) {
        Throwable th;
        int i;
        C69309NjA njA;
        int A022 = AnonymousClass0fD.A02(-921534523);
        C68496NKp.super.onCreate(bundle);
        04R.A00(DbV.A0G(this), false);
        Bundle requireArguments = requireArguments();
        C254743sy A002 = C67002Mga.A00(requireArguments, "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
        if (A002 != null) {
            DirectThreadKey A032 = C66647MaG.A03(A002);
            this.A08 = A032;
            String str = "threadKey";
            if (A032 != null) {
                String str2 = A032.A00;
                if (str2 != null) {
                    this.A0C = str2;
                    AnonymousClass0eM r3 = this.A0I;
                    2Dr A003 = 2L2.A00(AnonymousClass7TE.A0l(r3));
                    DirectThreadKey directThreadKey = this.A08;
                    if (directThreadKey != null) {
                        this.A05 = 2Dr.A03(A003, directThreadKey);
                        Parcelable parcelable = requireArguments.getParcelable("DirectThreadSharedMediaFragment.DIRECT_SHARED_MEDID_SHARED_TARGET");
                        Parcelable.Creator creator = DirectShareTarget.CREATOR;
                        0qQ.A08(creator);
                        this.A07 = (DirectShareTarget) ((Parcelable) 0B0.A01(creator, parcelable, DirectShareTarget.class));
                        String A0t = C66580MXl.A0t(requireArguments);
                        String str3 = "";
                        if (A0t == null) {
                            A0t = str3;
                        }
                        this.A0A = A0t;
                        String string = requireArguments.getString("message_id");
                        if (string == null) {
                            string = str3;
                        }
                        this.A0B = string;
                        String string2 = requireArguments.getString("client_context");
                        if (string2 == null) {
                            string2 = str3;
                        }
                        this.A09 = string2;
                        AnonymousClass9HW r6 = (AnonymousClass9HW) this.A0J.getValue();
                        String str4 = this.A0C;
                        if (str4 == null) {
                            str = "threadId";
                        } else {
                            this.A0F = r6.A00(C66580MXl.A0g(str4), 67);
                            this.A04 = new AnonymousClass7H6(requireActivity(), AnonymousClass7TE.A0l(r3), (AnonymousClass3E6) null, 120, false, false);
                            this.A00 = requireArguments.getInt("direct_channel_audience_type");
                            String string3 = requireArguments.getString("channel_user_type");
                            if (string3 != null) {
                                str3 = string3;
                            }
                            this.A0D = str3;
                            Serializable serializable = requireArguments.getSerializable("prompts_entry_point");
                            if (serializable instanceof C69309NjA) {
                                njA = (C69309NjA) serializable;
                            } else {
                                njA = null;
                            }
                            this.A03 = njA;
                            this.A02 = C69868NtW.A00(AnonymousClass7TE.A0l(r3));
                            AnonymousClass7H6 r0 = this.A04;
                            if (r0 == null) {
                                str = "mediaViewerController";
                            } else {
                                registerLifecycleListener(r0);
                                ((C67743Mtw) this.A0K.getValue()).A01(true, false);
                                AnonymousClass0fD.A09(-175455463, A022);
                                return;
                            }
                        }
                    }
                } else {
                    th = AnonymousClass7TE.A0y();
                    i = -715441188;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        th = C66580MXl.A0p();
        i = -1311607748;
        AnonymousClass0fD.A09(i, A022);
        throw th;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(674197141);
        super.onDestroy();
        AnonymousClass7H6 r0 = this.A04;
        if (r0 == null) {
            0qQ.A0F("mediaViewerController");
            throw AnonymousClass00P.createAndThrow();
        }
        unregisterLifecycleListener(r0);
        AnonymousClass0fD.A09(-672174267, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(233581196);
        super.onDestroyView();
        this.A06 = null;
        this.A01 = null;
        DbX.A0R(this.A0I).A02(this.A0L, C71898Osg.class);
        AnonymousClass0fD.A09(-1349848551, A022);
    }
}
