package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.bugreporter.source.BugReportSource;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.msys.subtype.MsysThreadSubtype;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Of3  reason: case insensitive filesystem */
public final class C71185Of3 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C71185Of3(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj2;
        this.A03 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C254793t3 r2;
        String C6k;
        C70830ONc oNc;
        2Er r0;
        String C6k2;
        switch (this.A00) {
            case 0:
                AnonymousClass7SD r02 = (AnonymousClass7SD) this.A02;
                Map map = r02.A0e;
                if (map != null && (r2 = r02.A0P) != null) {
                    1px A002 = AnonymousClass1q4.A00();
                    C3027965h r1 = (C3027965h) this.A03;
                    FragmentActivity fragmentActivity = (FragmentActivity) r1.A02.invoke();
                    UserSession userSession = r1.A00.A00;
                    User user = (User) this.A01;
                    if (user != null) {
                        A002.CfZ(fragmentActivity, userSession, user, r2.toString(), "CreatorAIBetaDisclosure", map);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C70964OTl oTl = (C70964OTl) this.A03;
                C66930MfP mfP = oTl.A07;
                2Er r03 = (2Er) this.A02;
                C66930MfP.A01(mfP, r03.C6C(), r03.C6k(), "daily_prompt_responses_sheet_rendered", "tap", "see_responses_button", "daily_prompt_reply_reminder_dialog", r03.AdN());
                AnonymousClass914 r6 = (AnonymousClass914) this.A01;
                Bundle A0a = AnonymousClass7TE.A0a();
                String C6C = r03.C6C();
                if (C6C != null && (C6k = r03.C6k()) != null) {
                    A0a.putString("surface", "daily_prompt");
                    A0a.putString("collection_id", r6.A03);
                    A0a.putString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, C6C);
                    A0a.putString("message_id", r6.A02);
                    DirectThreadKey A0e = C66581MXm.A0e(C6C);
                    A0e.A01 = C6k;
                    C67002Mga.A01(A0a, A0e, "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
                    Activity activity = oTl.A04;
                    AnonymousClass6W8 A0b = DbS.A0b(activity, A0a, oTl.A05, ModalActivity.class, "direct_card_gallery");
                    A0b.A00 = 1;
                    C66581MXm.A16(activity, A0b);
                    return;
                }
                return;
            case 2:
                Object obj = ((List) this.A01).get(i);
                C72536P9t p9t = (C72536P9t) this.A03;
                Activity activity2 = p9t.A00;
                if (JTT.A1Z(activity2, obj, 2131960654)) {
                    C254703su r3 = (C254703su) this.A02;
                    Integer num = r3.A1F;
                    if (num == AnonymousClass05K.A0N || num == AnonymousClass05K.A0Y) {
                        AnonymousClass7X2 r12 = p9t.A07;
                        String A0f = r3.A0f();
                        if (A0f != null) {
                            r12.FJD((View) null, (AnonymousClass7FU) null, C66580MXl.A0i(A0f, (String) null), (C62320sa) null, 0);
                            return;
                        }
                        throw AnonymousClass7TE.A0y();
                    }
                    return;
                } else if (JTT.A1Z(activity2, obj, 2131960256)) {
                    C254703su r5 = (C254703su) this.A02;
                    C254743sy r13 = (C254743sy) p9t.A09.get();
                    if (r13 != null) {
                        C66580MXl.A0V(p9t.A08).BsD().EJF(activity2, p9t.A02, r5, C66647MaG.A03(r13));
                        p9t.A05.A01((C254933tI) null, (Integer) null, -1);
                        return;
                    }
                    p9t.A06.A00(002.A0R("DirectThreadFragment.retryFailedMessage", ": null_direct_threadkey"));
                    0wb.A04("ThreadKey is null", "DirectThreadFragment.retryFailedMessage", 1);
                    return;
                } else if (JTT.A1Z(activity2, obj, 2131971293)) {
                    UserSession userSession2 = p9t.A04;
                    2Ab r14 = (2Ab) userSession2.A01(2Ab.class, AnonymousClass2Ac.A00);
                    C254703su r52 = (C254703su) this.A02;
                    Integer num2 = r52.A1F;
                    C270214gN r7 = r52.A0r;
                    if ((num2 == AnonymousClass05K.A0N || num2 == AnonymousClass05K.A0Y) && r7 != null) {
                        r14.A00 = r52;
                    } else {
                        r14.A00 = null;
                        StringBuilder A1A = AnonymousClass7TE.A1A();
                        A1A.append("Attempted to set setFailedMessage with a non failed message. lifeCycle=");
                        A1A.append(AnonymousClass48R.A00(num2));
                        0wb.A03("setFailedMessage_with_nonFailed_message", AnonymousClass7TG.A0m(r7, ", sendError=", A1A));
                    }
                    if (2FW.A0q == r52.A10 && 2R8.A00(userSession2)) {
                        AnonymousClass0eK r72 = p9t.A08;
                        if (C66582MXn.A0d(r72).AlE().A00(C376179Gx.RAVEN_VISUAL_MESSAGING)) {
                            AnonymousClass2Ad r22 = (AnonymousClass2Ad) userSession2.A01(AnonymousClass2Ad.class, new C69742Ae());
                            AnonymousClass7S7 A0d = C66582MXn.A0d(r72);
                            0qQ.A0C(A0d, "null cannot be cast to non-null type com.instagram.direct.fragment.thread.infra.open.intf.LegacyDirectThreadAccessor");
                            AnonymousClass2Ep r04 = ((AnonymousClass7S6) A0d).A07;
                            r04.getClass();
                            r22.A01 = r04;
                            r22.A00 = r52;
                        }
                    }
                    FGP.A01(activity2, BugReportSource.DIRECT_SEND_FAILURE, userSession2, AnonymousClass7TE.A16(activity2, 2131971293), AnonymousClass7TE.A16(activity2, 2131954333));
                    return;
                } else {
                    return;
                }
            case 3:
                Context context = (Context) this.A01;
                UserSession userSession3 = (UserSession) this.A03;
                AnonymousClass7TG.A1N(context, userSession3);
                new C67100MiK(context, userSession3).A03(C300965yF.A05((C254793t3) this.A02), AnonymousClass05K.A07);
                return;
            case 4:
                dialogInterface.dismiss();
                C71866Os8 A003 = C69841Nt5.A00(((C328837Gl) this.A03).A01);
                2FW r05 = null;
                String valueOf = String.valueOf(((C254763t0) this.A01).A00);
                C254703su r15 = (C254703su) this.A02;
                if (r15 != null) {
                    r05 = r15.A10;
                }
                String valueOf2 = String.valueOf(r05);
                AnonymousClass7TG.A1N(valueOf, valueOf2);
                0Aj A0H = C66582MXn.A0H(A003.A00, "direct_replace_pin_click", valueOf);
                A0H.AAJ("media_type", valueOf2);
                A0H.AAJ("target", "cancel");
                A0H.Cgf();
                return;
            case 5:
                PA3 pa3 = (PA3) this.A02;
                C69668Npq npq = (C69668Npq) this.A01;
                C73576PgA pgA = new C73576PgA(pa3, 1);
                PA3.A00((View) null, (AnonymousClass7FU) null, pa3, npq, (C254743sy) this.A03, (C62320sa) null, C66580MXl.A14(pa3, 26), new C73607Pgi(pa3, 4), pgA, false);
                return;
            case 6:
                oNc = (C70830ONc) this.A03;
                r0 = (2Er) this.A02;
                break;
            case 9:
                Context context2 = (Context) this.A01;
                C73854Pkr pkr = C73854Pkr.A00;
                0qQ.A0B(pkr, 2);
                ((1X9) this.A02).A00(context2, (UserSession) this.A03).A0A(pkr);
                dialogInterface.dismiss();
                return;
            case 10:
                C68487NKf nKf = (C68487NKf) this.A01;
                View view = (View) this.A02;
                Context context3 = (Context) this.A03;
                String[] split = AnonymousClass7TF.A0f(DbU.A0E(view, R.id.armadillo_send_to_username)).trim().split(",");
                String trim = AnonymousClass7TF.A0f(DbU.A0E(view, R.id.armadillo_send_text)).trim();
                ArrayList A1C = AnonymousClass7TE.A1C();
                StringBuilder sb = new StringBuilder("Sending Encrypted message to: ");
                int length = split.length;
                int i2 = 0;
                while (i2 < length) {
                    String str = split[i2];
                    17i r06 = nKf.A01;
                    User user2 = (User) r06.A02.get(str.trim());
                    if (user2 != null) {
                        sb.append(user2.B8Q());
                        sb.append(", ");
                        A1C.add(OXK.A00(user2));
                        i2++;
                    } else {
                        C59689JTv.A09(context3, 002.A0g("Recipient user null for given username: ", str, ". Please try again."));
                        return;
                    }
                }
                1a8 r4 = nKf.A02;
                C304566Ea r32 = AnonymousClass6EY.A00(nKf.getSession(), C68487NKf.__redex_internal_original_name).A00;
                PU9.A00(C66582MXn.A0N(r32.A06(MsysThreadSubtype.Standard.A00, (String) null, A1C).A0M(new Ov3(trim, r32, 6)), "rxoutbox_bootstrap_thread_with_text_message"), r4, context3, sb, 23);
                return;
            case 11:
                C299275ur.A00((C307896Rx) this.A01, AnonymousClass6Tm.A01, (C277014uI) this.A03);
                return;
            default:
                oNc = (C70830ONc) this.A03;
                C66930MfP mfP2 = oNc.A02;
                r0 = (2Er) this.A02;
                C66930MfP.A01(mfP2, r0.C6C(), r0.C6k(), "daily_prompt_responses_sheet_rendered", "tap", "see_responses_button", "daily_prompt_reply_reminder_dialog", r0.AdN());
                break;
        }
        AnonymousClass914 r62 = (AnonymousClass914) this.A01;
        Bundle A0a2 = AnonymousClass7TE.A0a();
        String C6C2 = r0.C6C();
        if (C6C2 != null && (C6k2 = r0.C6k()) != null) {
            A0a2.putString("surface", "daily_prompt");
            A0a2.putString("collection_id", r62.A03);
            A0a2.putString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, C6C2);
            A0a2.putString("message_id", r62.A02);
            DirectThreadKey A0e2 = C66581MXm.A0e(C6C2);
            A0e2.A01 = C6k2;
            C67002Mga.A01(A0a2, A0e2, "DirectStoryViewerFragment.ARGUMENTS_THREAD_KEY");
            Activity activity3 = oNc.A00;
            AnonymousClass6W8 A0b2 = DbS.A0b(activity3, A0a2, oNc.A01, ModalActivity.class, "direct_card_gallery");
            A0b2.A00 = 1;
            C66581MXm.A16(activity3, A0b2);
        }
    }
}
