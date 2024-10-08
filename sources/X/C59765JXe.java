package X;

import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.clips.template.creation.model.ClipsTemplateModel;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.model.venue.LocationDict;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.user.model.UpcomingEvent;
import com.instagram.user.model.UpcomingEventImpl;
import com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.JXe  reason: case insensitive filesystem */
public final class C59765JXe {
    public JXd A00;
    public JXd A01;
    public JXd A02;
    public JXd A03;
    public JXd A04;
    public JXd A05;
    public JXd A06;
    public JXd A07;
    public JXd A08;
    public JXd A09;
    public JXd A0A;
    public JXd A0B;
    public JXd A0C;
    public JXd A0D;
    public JXd A0E;
    public JXd A0F;
    public JXd A0G;
    public JXd A0H;
    public JXd A0I;
    public JXd A0J;
    public JXd A0K;
    public JXd A0L;
    public JXd A0M;
    public JXd A0N;
    public JXd A0O;
    public JXd A0P;
    public JXd A0Q;
    public JXd A0R;
    public JXd A0S;
    public JXd A0T;
    public JXd A0U;
    public JXd A0V;
    public JXd A0W;
    public JXd A0X;
    public JXd A0Y;
    public JXd A0Z;
    public JXd A0a;
    public JXd A0b;
    public JXd A0c;
    public JXd A0d;
    public JXd A0e;
    public JXd A0f;
    public JXd A0g;
    public JXd A0h;
    public JXd A0i;
    public JXd A0j;
    public JXd A0k;
    public JXd A0l;
    public JXd A0m;
    public JXd A0n;
    public JXd A0o;
    public JXd A0p;
    public JXd A0q;
    public JXd A0r;
    public JXd A0s;
    public JXd A0t;
    public JXd A0u;
    public JXd A0v;
    public JXd A0w;
    public JXd A0x;
    public JXd A0y;
    public JXd A0z;
    public JXd A10;
    public JXd A11;
    public JXd A12;
    public JXd A13;

    public final C293505kq A01(C293505kq r128) {
        C366688pV r1;
        Jv8 A002;
        C279584ys r59;
        C293505kq r0 = r128;
        0qQ.A0B(r0, 0);
        String str = r0.A0T;
        C2801950r r56 = r0.A0H;
        JYL jyl = (JYL) this.A12.A02(r0.A0P);
        Jv8 jv8 = (Jv8) 00k.A0J(r0.A0u);
        C59777JXw jXw = C59777JXw.A00;
        JYK jyk = JYK.VIDEO;
        C59764JXc A003 = C59764JXc.A00(jyk);
        JXd jXd = this.A0u;
        List list = r0.A0v;
        Object A022 = jXd.A02(list);
        0qQ.A0B(A022, 0);
        C59764JXc A004 = C59764JXc.A00(A022);
        JXd jXd2 = this.A0i;
        C370018vh r4 = r0.A0C;
        C370018vh r12 = (C370018vh) jXd2.A02(r4);
        UpcomingEventImpl upcomingEventImpl = null;
        if (r12 != null) {
            r1 = r12.A01;
        } else {
            r1 = null;
        }
        C59764JXc A005 = C59764JXc.A00(r1);
        JXd jXd3 = this.A0b;
        List list2 = r0.A0p;
        Object A023 = jXd3.A02(list2);
        if (A023 == null) {
            A023 = 0sn.A00;
        }
        C59764JXc A006 = C59764JXc.A00(A023);
        JXd jXd4 = this.A0n;
        List list3 = r0.A0s;
        Object A024 = jXd4.A02(list3);
        if (A024 == null) {
            A024 = 0sn.A00;
        }
        C59764JXc A007 = C59764JXc.A00(A024);
        if (jv8 == null) {
            String A0b2 = AnonymousClass7TF.A0b();
            A002 = JYI.A00(A003, A006, jXw, A007, A005, A004, new Jv8((C366688pV) null, (KN4) null, jyk, A0b2, AnonymousClass7TF.A0q(A0b2, 0), AnonymousClass7TE.A1C(), AnonymousClass7TE.A1C()));
        } else {
            A002 = JYI.A00(A003, A006, jXw, A007, A005, A004, jv8);
        }
        List A1I = AnonymousClass7TE.A1I(A002);
        List list4 = (List) this.A0u.A02(list);
        JXu jXu = (JXu) this.A0y.A02(r0.A0G);
        AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) this.A02.A02(r0.A0N);
        AudioOverlayTrack audioOverlayTrack2 = r0.A0M;
        List list5 = (List) this.A0b.A02(list2);
        String str2 = (String) this.A0g.A02(r0.A0i);
        C370018vh r45 = (C370018vh) this.A0i.A02(r4);
        List list6 = (List) this.A0n.A02(list3);
        List list7 = (List) this.A01.A02(r0.A0j);
        List list8 = (List) this.A0l.A02(r0.A0l);
        ShareMediaLoggingInfo shareMediaLoggingInfo = (ShareMediaLoggingInfo) this.A0k.A02(r0.A0B);
        AnonymousClass9P8 r40 = (AnonymousClass9P8) this.A0j.A02(r0.A0E);
        String str3 = r0.A0h;
        String str4 = (String) this.A06.A02(r0.A0S);
        String str5 = (String) this.A0C.A02(r0.A0V);
        MediaCroppingCoordinates mediaCroppingCoordinates = (MediaCroppingCoordinates) this.A0D.A02(r0.A06);
        boolean A008 = A00(this.A0U, r0.A17);
        String str6 = (String) this.A0H.A02(r0.A0X);
        List list9 = (List) this.A0h.A02(r0.A0q);
        C272024jy r34 = (C272024jy) this.A0A.A02(r0.A0O);
        AnonymousClass3QO r33 = (AnonymousClass3QO) this.A00.A02(r0.A0K);
        String str7 = (String) this.A0w.A02(r0.A0U);
        List list10 = (List) this.A09.A02(r0.A0n);
        String str8 = (String) this.A0F.A02(r0.A0W);
        LocationDict locationDict = (LocationDict) this.A0X.A02(r0.A0L);
        List list11 = (List) this.A0N.A02(r0.A0o);
        String str9 = (String) this.A0f.A02(r0.A0g);
        CropInfo cropInfo = (CropInfo) this.A0t.A02(r0.A0A);
        C63815L7w l7w = (C63815L7w) this.A05.A02(r0.A0D);
        C61062Jw0 jw0 = (C61062Jw0) this.A07.A02(r0.A04);
        LFS lfs = (LFS) this.A0z.A02(r0.A09);
        List list12 = (List) this.A0o.A02(r0.A0t);
        boolean A009 = A00(this.A0Q, r0.A12);
        boolean A0010 = A00(this.A0V, r0.A18);
        String str10 = (String) this.A0W.A02(r0.A0a);
        String str11 = (String) this.A0M.A02(r0.A0Z);
        ExistingStandaloneFundraiserForFeedModel existingStandaloneFundraiserForFeedModel = (ExistingStandaloneFundraiserForFeedModel) this.A0G.A02(r0.A0R);
        String str12 = (String) this.A0I.A02(r0.A0Y);
        NewFundraiserInfo newFundraiserInfo = (NewFundraiserInfo) this.A0d.A02(r0.A0J);
        C270564gw r13 = (C270564gw) this.A0v.A02(r0.A08);
        if (r13 != null) {
            r59 = r13.FDm();
        } else {
            r59 = null;
        }
        boolean A0011 = A00(this.A0p, r0.A19);
        List list13 = r0.A0k;
        String str13 = (String) this.A13.A02(r0.A0b);
        boolean A0012 = A00(this.A0P, r0.A11);
        boolean A0013 = A00(this.A10, r0.A0z);
        boolean A0014 = A00(this.A0S, r0.A14);
        boolean A0015 = A00(this.A0T, r0.A16);
        boolean A0016 = A00(this.A0R, r0.A13);
        List list14 = (List) this.A0m.A02(r0.A0r);
        UpcomingEvent upcomingEvent = (UpcomingEvent) this.A0s.A02(r0.A0Q);
        if (upcomingEvent != null) {
            upcomingEventImpl = upcomingEvent.FGz((1E6) null);
        }
        int A0M2 = AnonymousClass7TE.A0M(this.A0Y.A02(Integer.valueOf(r0.A00)));
        long A0R2 = AnonymousClass7TE.A0R(this.A0x.A02(Long.valueOf(r0.A01)));
        L6N l6n = r0.A0F;
        boolean A0017 = A00(this.A0L, r0.A0y);
        boolean A0018 = A00(this.A0E, r0.A0w);
        boolean A0019 = A00(this.A0K, r0.A0x);
        return new C293505kq((C61080JwI) this.A0r.A02(r0.A02), (C61066Jw4) this.A03.A02(r0.A03), jw0, (C61100JxB) this.A0B.A02(r0.A05), mediaCroppingCoordinates, (MediaGenAIDetectionMethod) this.A0J.A02(r0.A07), r59, lfs, cropInfo, shareMediaLoggingInfo, r45, l7w, r40, l6n, jXu, r56, (C61000Juw) this.A04.A02(r0.A0I), newFundraiserInfo, r33, locationDict, audioOverlayTrack, audioOverlayTrack2, r34, jyl, upcomingEventImpl, existingStandaloneFundraiserForFeedModel, str, str4, str2, str3, str5, str6, str7, str8, str9, str13, str10, str11, str12, (String) this.A0e.A02(r0.A0f), (String) this.A0a.A02(r0.A0d), (String) this.A0Z.A02(r0.A0c), (String) this.A0c.A02(r0.A0e), list4, list6, A1I, list9, list11, list10, list5, list8, list13, list7, list12, list14, (List) this.A08.A02(r0.A0m), A0M2, A0R2, A008, A0011, A009, A0010, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A00(this.A11, r0.A15), A00(this.A0O, r0.A10), A00(this.A0q, r0.A1A));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.L6N, java.lang.Object] */
    public final C293505kq A02(C2801950r r81, String str) {
        String str2 = str;
        0qQ.A0B(str2, 0);
        ArrayList A1C = AnonymousClass7TE.A1C();
        JXu jXu = JXu.A02;
        ? obj = new Object();
        obj.A01 = -1;
        obj.A02 = -1;
        obj.A00 = -1;
        return A01(new C293505kq((C61080JwI) null, (C61066Jw4) null, (C61062Jw0) null, (C61100JxB) null, (MediaCroppingCoordinates) null, (MediaGenAIDetectionMethod) null, (C279584ys) null, (LFS) null, (CropInfo) null, (ShareMediaLoggingInfo) null, (C370018vh) null, (C63815L7w) null, (AnonymousClass9P8) null, obj, jXu, r81, (C61000Juw) null, (NewFundraiserInfo) null, (AnonymousClass3QO) null, (LocationDict) null, (AudioOverlayTrack) null, (AudioOverlayTrack) null, (C272024jy) null, JYL.VIDEO, (UpcomingEventImpl) null, (ExistingStandaloneFundraiserForFeedModel) null, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, A1C, (List) null, AnonymousClass7TE.A1C(), (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, 0, -1, true, false, false, false, false, false, false, false, false, false, false, false, false, true, false));
    }

    public final void A04(ClipsTemplateModel clipsTemplateModel) {
        C279584ys r1;
        String str = null;
        if (clipsTemplateModel != null) {
            r1 = clipsTemplateModel.A01;
        } else {
            r1 = null;
        }
        this.A0v = C59764JXc.A00(r1);
        if (clipsTemplateModel != null) {
            str = clipsTemplateModel.A03;
        }
        this.A13 = C59764JXc.A00(str);
    }

    public final void A06(List list) {
        0qQ.A0B(list, 0);
        this.A0u = C59764JXc.A00(list);
    }

    public C59765JXe() {
        C59777JXw jXw = C59777JXw.A00;
        this.A12 = jXw;
        this.A0u = jXw;
        this.A02 = jXw;
        this.A0b = jXw;
        this.A0y = jXw;
        this.A0g = jXw;
        this.A0i = jXw;
        this.A0n = jXw;
        this.A0k = jXw;
        this.A0j = jXw;
        this.A06 = jXw;
        this.A0C = jXw;
        this.A0D = jXw;
        this.A0U = jXw;
        this.A0H = jXw;
        this.A0h = jXw;
        this.A0A = jXw;
        this.A00 = jXw;
        this.A0w = jXw;
        this.A09 = jXw;
        this.A0F = jXw;
        this.A0X = jXw;
        this.A0N = jXw;
        this.A0f = jXw;
        this.A0t = jXw;
        this.A05 = jXw;
        this.A07 = jXw;
        this.A0z = jXw;
        this.A0o = jXw;
        this.A0Q = jXw;
        this.A0V = jXw;
        this.A0W = jXw;
        this.A0M = jXw;
        this.A0G = jXw;
        this.A0I = jXw;
        this.A0d = jXw;
        this.A0v = jXw;
        this.A0p = jXw;
        this.A13 = jXw;
        this.A0P = jXw;
        this.A10 = jXw;
        this.A0S = jXw;
        this.A0T = jXw;
        this.A0R = jXw;
        this.A0m = jXw;
        this.A0s = jXw;
        this.A0e = jXw;
        this.A0Y = jXw;
        this.A0x = jXw;
        this.A01 = jXw;
        this.A0l = jXw;
        this.A0L = jXw;
        this.A0E = jXw;
        this.A0a = jXw;
        this.A0Z = jXw;
        this.A0c = jXw;
        this.A08 = jXw;
        this.A04 = jXw;
        this.A03 = jXw;
        this.A0r = jXw;
        this.A0B = jXw;
        this.A0K = jXw;
        this.A0J = jXw;
        this.A11 = jXw;
        this.A0O = jXw;
        this.A0q = jXw;
    }

    public static boolean A00(JXd jXd, boolean z) {
        return ((Boolean) jXd.A02(Boolean.valueOf(z))).booleanValue();
    }

    public final void A03(long j) {
        this.A0x = C59764JXc.A00(Long.valueOf(j));
    }

    public final void A05(JXu jXu) {
        this.A0y = C59764JXc.A00(jXu);
    }
}
