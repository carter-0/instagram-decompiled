package X;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.newsfeed.followrequests.data.FollowRequestsRepository;
import com.instagram.newsfeed.fragment.NewsfeedFragment;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import go.Seq;
import java.util.Iterator;
import java.util.Map;
import org.webrtc.EglBase14Impl;

/* renamed from: X.G2b  reason: case insensitive filesystem */
public final class C51792G2b extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51792G2b(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new C51792G2b(obj, i));
    }

    /* JADX WARNING: type inference failed for: r7v3, types: [X.F0f, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v69, types: [java.lang.Object, X.2qU] */
    public final /* bridge */ /* synthetic */ Object invoke() {
        FollowRequestsRepository followRequestsRepository;
        String str;
        boolean z;
        long j;
        Number number;
        C51910G7e ff2;
        String str2;
        String str3;
        switch (this.A00) {
            case 0:
                followRequestsRepository = ((C47538E7b) this.A01).A03;
                break;
            case 1:
                return new C49355EuJ((E7Z) this.A01);
            case 2:
                C47537E7a e7a = (C47537E7a) this.A01;
                return new F2T(e7a, e7a.A03);
            case 3:
                followRequestsRepository = ((C47537E7a) this.A01).A01;
                break;
            case 4:
                C47444E2q e2q = (C47444E2q) this.A01;
                return C229382nI.A02(e2q, e2q.A01, DbT.A0X(e2q.A07), (2el) null);
            case 5:
                C47444E2q e2q2 = (C47444E2q) this.A01;
                return new C49490EwV(e2q2.A01, AnonymousClass7TE.A0l(e2q2.A07));
            case 6:
                ((C47289DuI) ((C47444E2q) this.A01).A04.getValue()).A01.A05();
                break;
            case 7:
                C47444E2q e2q3 = (C47444E2q) this.A01;
                e2q3.A03.getValue();
                C47539E7c.A01(C47444E2q.A00(e2q3));
                break;
            case 8:
                return new C47289DuI(AnonymousClass7TE.A0l(((C47444E2q) this.A01).A07));
            case 9:
                1YN A002 = AnonymousClass2bO.A00();
                C47444E2q e2q4 = (C47444E2q) this.A01;
                UserSession A0l = AnonymousClass7TE.A0l(e2q4.A07);
                QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0T;
                AnonymousClass2bO.A00();
                return A002.A01(e2q4, e2q4, A0l, 2bV.A05(new C50735Fha(e2q4, 6), new C50736Fhb(e2q4, 5)), quickPromotionSlot);
            case 10:
            case 28:
            case 38:
                return this.A01;
            case 11:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
            case 39:
                return DbT.A0r(this.A01);
            case 13:
                C47444E2q e2q5 = (C47444E2q) this.A01;
                Bundle requireArguments = e2q5.requireArguments();
                AnonymousClass0eM r7 = e2q5.A07;
                UserSession A0l2 = AnonymousClass7TE.A0l(r7);
                AnonymousClass0iw r5 = e2q5.A01;
                return new EFW(DbY.A05(e2q5), r5, A0l2, (C49490EwV) e2q5.A03.getValue(), (C47289DuI) e2q5.A04.getValue(), C333947aP.A00(DbY.A05(e2q5), AnonymousClass7TE.A0l(r7), r5.getModuleName()), (C49714F2z) e2q5.A05.getValue(), requireArguments.getBoolean("ARG_ALLOW_TRUNCATE_FOLLOW_REQUESTS"), requireArguments.getBoolean("ARG_HIDE_APPROVE_BUTTON"), 182.A06(0Tu.A05, DbT.A0X(r7), 36316035841920884L), requireArguments.getBoolean("ARG_SHOW_PRIVATE_TO_PUBLIC_HEADER"), requireArguments.getBoolean("ARG_SHOW_SUGGESTED_USERS"), false, C49966FGz.A00.A08(AnonymousClass7TE.A0l(r7)));
            case 14:
                C3253572b r11 = new C3253572b();
                r11.A02 = R.drawable.loadmore_icon_refresh_compound;
                return r11;
            case 15:
                C47525E6l e6l = (C47525E6l) this.A01;
                AnonymousClass71T r10 = new AnonymousClass71T(e6l.requireContext());
                C232472tm r9 = new C232472tm(e6l.requireContext());
                Context requireContext = e6l.requireContext();
                AnonymousClass0eM r8 = e6l.A0C;
                UserSession A0l3 = AnonymousClass7TE.A0l(r8);
                AnonymousClass0eM r112 = e6l.A02;
                C46450DfD dfD = new C46450DfD(requireContext, DbT.A0O(r112), A0l3, e6l, (DdO) e6l.A0B.getValue(), AnonymousClass7TE.A1a(AnonymousClass7TE.A14(e6l.A0D)), true, false);
                C15571Uez uez = new C15571Uez(e6l.requireContext(), DbT.A0O(r112), AnonymousClass7TE.A0l(r8), e6l, e6l.requireArguments().getBoolean("ARG_HIDE_APPROVE_BUTTON"), e6l.requireArguments().getBoolean(AnonymousClass000.A00(415)), false);
                C47597E9j e9j = new C47597E9j(e6l.requireContext());
                C336947fR r52 = new C336947fR(e6l.requireContext());
                EA0 ea0 = new EA0(e6l.requireContext(), e6l);
                1YN A003 = AnonymousClass2bO.A00();
                e6l.requireContext();
                C231982sj A03 = A003.A03(DbT.A0O(r112), AnonymousClass7TE.A0l(r8), (2bu) e6l.A0A.getValue());
                C46448DfA A004 = C46448DfA.A00(2131974681);
                FGF fgf = new FGF(2131968326);
                C61489K9u k9u = new C61489K9u(e6l.requireContext(), (Integer) null);
                Context requireContext2 = e6l.requireContext();
                boolean A1Z = AnonymousClass7TF.A1Z(e6l.A0F);
                ? obj = new Object();
                Resources resources = requireContext2.getResources();
                obj.A01 = Integer.valueOf(R.drawable.empty_state_follow_avatar);
                int i = 2131962574;
                if (A1Z) {
                    i = 2131962571;
                }
                try {
                    obj.A04 = resources.getString(i);
                    int i2 = 2131962573;
                    if (A1Z) {
                        i2 = 2131962570;
                    }
                    obj.A03 = resources.getString(i2);
                } catch (Resources.NotFoundException unused) {
                }
                NLN nln = new NLN(e6l.requireContext());
                UserSession A0l4 = AnonymousClass7TE.A0l(r8);
                return new K9F((View.OnClickListener) e6l.A0G.getValue(), new C47622EAi(e6l.requireContext(), DbT.A0O(r112), A0l4), dfD, ea0, A03, r10, k9u, obj, r9, A004, e9j, r52, nln, fgf, uez);
            case 16:
                if (AnonymousClass7TF.A1Z(((C47525E6l) this.A01).A0E)) {
                    str = "follow_requests_with_overflow";
                } else {
                    str = "follow_requests";
                }
                return new C50232FUo(str);
            case 17:
                Fragment fragment = (Fragment) this.A01;
                return new C55715HmC(fragment.requireView(), new C51651FyD(fragment, 12));
            case EglBase14Impl.EGLExt_SDK_VERSION:
                int i3 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                C47525E6l e6l2 = (C47525E6l) this.A01;
                return new C229402nK(e6l2.requireActivity(), DbT.A0O(e6l2.A02), AnonymousClass7TE.A0l(e6l2.A0C), 23598336);
            case 19:
                C47525E6l e6l3 = (C47525E6l) this.A01;
                return C229382nI.A02(e6l3, DbT.A0O(e6l3.A02), DbT.A0X(e6l3.A0C), (2el) null);
            case 20:
                C47525E6l e6l4 = (C47525E6l) this.A01;
                return new C49490EwV(DbT.A0O(e6l4.A02), AnonymousClass7TE.A0l(e6l4.A0C));
            case 21:
                return new C47289DuI(AnonymousClass7TE.A0l(((C47525E6l) this.A01).A0C));
            case 22:
                1YN A005 = AnonymousClass2bO.A00();
                C47525E6l e6l5 = (C47525E6l) this.A01;
                UserSession A0l5 = AnonymousClass7TE.A0l(e6l5.A0C);
                QuickPromotionSlot quickPromotionSlot2 = QuickPromotionSlot.A0T;
                AnonymousClass2bO.A00();
                C50735Fha fha = new C50735Fha(e6l5, 7);
                C50733FhY fhY = new C50733FhY(e6l5, 2);
                return A005.A01(e6l5, e6l5, A0l5, 2bV.A01(new C50731FhW(e6l5, 2), fhY, fha, (C230922qa) null, new C50736Fhb(e6l5, 6), (C230882qT) null, AnonymousClass7TE.A0u()), quickPromotionSlot2);
            case 23:
                C47525E6l e6l6 = (C47525E6l) this.A01;
                return new ELS(e6l6.requireActivity(), DbT.A0O(e6l6.A02), AnonymousClass7TE.A0l(e6l6.A0C), e6l6);
            case 24:
                return AnonymousClass7TF.A0R(0Tu.A05, DbT.A0X(((C47525E6l) this.A01).A0C), 36316035841920884L);
            case 25:
                return DbU.A0g(DbS.A0B(this.A01), AnonymousClass000.A00(415));
            case 26:
                return DbU.A0g(DbS.A0B(this.A01), "ARG_SHOW_PRIVATE_TO_PUBLIC_HEADER");
            case 27:
                return new FP3(this.A01, 66);
            case 31:
                C47525E6l e6l7 = (C47525E6l) this.A01;
                Bundle requireArguments2 = e6l7.requireArguments();
                AnonymousClass0eM r6 = e6l7.A0C;
                UserSession A0l6 = AnonymousClass7TE.A0l(r6);
                AnonymousClass0eM r82 = e6l7.A02;
                return new EFW(DbY.A05(e6l7), DbT.A0O(r82), A0l6, (C49490EwV) e6l7.A07.getValue(), (C47289DuI) e6l7.A08.getValue(), C333947aP.A00(DbY.A05(e6l7), AnonymousClass7TE.A0l(r6), DbT.A0O(r82).getModuleName()), (C49714F2z) e6l7.A09.getValue(), requireArguments2.getBoolean("ARG_ALLOW_TRUNCATE_FOLLOW_REQUESTS"), requireArguments2.getBoolean("ARG_HIDE_APPROVE_BUTTON"), AnonymousClass7TE.A1a(AnonymousClass7TE.A14(e6l7.A0D)), requireArguments2.getBoolean("ARG_SHOW_PRIVATE_TO_PUBLIC_HEADER"), requireArguments2.getBoolean("ARG_SHOW_SUGGESTED_USERS"), false, C49966FGz.A00.A08(AnonymousClass7TE.A0l(r6)));
            case 32:
                C47524E6k e6k = (C47524E6k) this.A01;
                boolean z2 = e6k.requireArguments().getBoolean("ARG_SPAM_FOLLOWER_SETTING_ENABLED");
                Context requireContext3 = e6k.requireContext();
                C3253572b r4 = new C3253572b();
                if (z2) {
                    Resources resources2 = requireContext3.getResources();
                    Uri A09 = DbT.A09(SQU.A01(e6k.requireContext(), "https://help.instagram.com/1542122179895279"));
                    String A0d = AnonymousClass7TF.A0d(resources2, 2131964884);
                    r4.A0D = resources2.getString(2131974104);
                    z = true;
                    r4.A07 = AnonymousClass7AV.A00(A09, A0d, resources2.getString(2131974103, new Object[]{A0d}));
                } else {
                    Resources resources3 = requireContext3.getResources();
                    try {
                        r4.A0D = resources3.getString(2131974102);
                        r4.A07 = resources3.getString(2131974101);
                        r4.A0C = resources3.getString(2131974108);
                        r4.A06 = new C50985FmY(e6k, 1);
                        z = true;
                    } catch (Resources.NotFoundException unused2) {
                    }
                }
                r4.A0L = z;
                AnonymousClass71T r3 = new AnonymousClass71T(e6k.requireContext());
                C15571Uez uez2 = new C15571Uez(e6k.requireContext(), DbT.A0O(e6k.A01), AnonymousClass7TE.A0l(e6k.A07), e6k, false, false, true);
                C47597E9j e9j2 = new C47597E9j(e6k.requireContext());
                C66971Mg4 mg4 = new C66971Mg4(e6k.requireContext());
                C336947fR r62 = new C336947fR(e6k.requireContext());
                String A0m = DbU.A0m(e6k, 2131974100);
                SpannableStringBuilder A0C = DbS.A0C(A0m);
                AnonymousClass7AV.A05(A0C, new C48040ESf(e6k, e6k.requireContext().getColor(2Yu.A0D(e6k.requireContext()))), A0m);
                FGF fgf2 = new FGF(A0C);
                fgf2.A06 = true;
                return new K9E(r4, r3, e9j2, r62, mg4, fgf2, uez2);
            case 33:
                Fragment fragment2 = (Fragment) this.A01;
                return new C55715HmC(fragment2.requireView(), new C51651FyD(fragment2, 13));
            case 34:
                int i4 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
                C47524E6k e6k2 = (C47524E6k) this.A01;
                return new C229402nK(e6k2.requireActivity(), DbT.A0O(e6k2.A01), AnonymousClass7TE.A0l(e6k2.A07), 23598336);
            case 35:
                C47524E6k e6k3 = (C47524E6k) this.A01;
                return new C49490EwV(DbT.A0O(e6k3.A01), AnonymousClass7TE.A0l(e6k3.A07));
            case 36:
                return new C47289DuI(AnonymousClass7TE.A0l(((C47524E6k) this.A01).A07));
            case 37:
                return AnonymousClass7TF.A0R(0Tu.A05, DbT.A0X(((C47524E6k) this.A01).A07), 36316035841920884L);
            case Seq.NULL_REFNUM:
                C47524E6k e6k4 = (C47524E6k) this.A01;
                AnonymousClass0eM r1 = e6k4.A07;
                UserSession A0l7 = AnonymousClass7TE.A0l(r1);
                AnonymousClass0eM r53 = e6k4.A01;
                C333957aQ A006 = C333947aP.A00(DbY.A05(e6k4), AnonymousClass7TE.A0l(r1), DbT.A0O(r53).getModuleName());
                boolean A1a = AnonymousClass7TE.A1a(AnonymousClass7TE.A14(e6k4.A08));
                return new EFW(DbY.A05(e6k4), DbT.A0O(r53), A0l7, (C49490EwV) e6k4.A04.getValue(), (C47289DuI) e6k4.A05.getValue(), A006, (C49714F2z) e6k4.A06.getValue(), false, false, A1a, false, false, true, false);
            case Seq.RefTracker.REF_OFFSET:
                C49646F0d f0d = (C49646F0d) this.A01;
                0xa r2 = f0d.A02;
                0xY AR4 = r2.AR4();
                long A0R = AnonymousClass7TE.A0R(f0d.A06.invoke()) - 86400000;
                Iterator A0u = AnonymousClass7TF.A0u(r2.getAll());
                long j2 = 0;
                while (A0u.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                    Object value = A1J.getValue();
                    if (!(value instanceof Long) || (number = (Number) value) == null) {
                        j = 0;
                    } else {
                        j = number.longValue();
                    }
                    if (j > A0R) {
                        j2++;
                    } else {
                        AR4.ED3(DbT.A13(A1J));
                    }
                }
                AR4.apply();
                return Long.valueOf(j2);
            case 43:
                AnonymousClass2bO.A00();
                ? obj2 = new Object();
                1YN A007 = AnonymousClass2bO.A00();
                NewsfeedFragment newsfeedFragment = (NewsfeedFragment) this.A01;
                UserSession A0l8 = AnonymousClass7TE.A0l(newsfeedFragment.A0A);
                QuickPromotionSlot quickPromotionSlot3 = QuickPromotionSlot.A05;
                AnonymousClass2bO.A00();
                Boolean A0u2 = AnonymousClass7TE.A0u();
                return A007.A01(newsfeedFragment, newsfeedFragment, A0l8, 2bV.A01(new C50732FhX(newsfeedFragment, obj2), new C50733FhY(newsfeedFragment, 3), (C230902qW) null, (C230922qa) null, (C71202bS) null, (C230882qT) null, A0u2), quickPromotionSlot3);
            case 44:
                AnonymousClass0eM r42 = ((NewsfeedFragment) this.A01).A0A;
                0lg A0X = DbT.A0X(r42);
                0Tu r32 = 0Tu.A05;
                boolean A06 = 182.A06(r32, A0X, 36325128287695484L);
                0lg A0X2 = DbT.A0X(r42);
                if (A06) {
                    ff2 = new C46538Dgf(182.A01(r32, A0X2, 36606603264529866L));
                } else {
                    ff2 = new Ff2(182.A01(r32, A0X2, 36606603264333256L));
                }
                C51910G7e g7e = ff2;
                try {
                    str2 = 182.A04(r32, AnonymousClass7TE.A0l(r42), 36888078241301275L);
                } catch (Throwable th) {
                    str2 = new 0eQ(th);
                }
                if (str2 instanceof 0eQ) {
                    str2 = "";
                }
                return new C49646F0d(g7e, 0xn.A01("newstab"), 0xn.A01("nf_reachability_upsell_limits"), str2, C46537Dge.A00, DbS.A04(r32, DbT.A0X(r42), 36606603264464329L));
            case 45:
                if (((C46352Dcv) this.A01).A0J.getValue() != null) {
                    str3 = "ig_comment_insights_hub";
                } else {
                    str3 = "newsfeed_you";
                }
                return DbS.A0O(str3);
            case 46:
                C46352Dcv dcv = (C46352Dcv) this.A01;
                return new C46524DgR(DbT.A03(dcv), dcv, (0xG) dcv.A05.getValue(), dcv.getSession());
            case 47:
                C46352Dcv dcv2 = (C46352Dcv) this.A01;
                return new F22((Dd4) dcv2.A0B.getValue(), (JS9) dcv2.A0C.getValue());
            case 48:
                DbV.A0Z((C46352Dcv) this.A01).A0F();
                break;
            case 49:
                return new C46329Dbx(((C46352Dcv) this.A01).getSession(), "feed", 31784970);
            default:
                return DbY.A0I(this.A01);
        }
        followRequestsRepository.A04((C49356EuK) null);
        return C60340gF.A00;
    }
}
