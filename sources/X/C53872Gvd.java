package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.api.schemas.MidCardClipsClickedAction;
import com.instagram.api.schemas.MidCardLayoutType;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Gvd  reason: case insensitive filesystem */
public final class C53872Gvd extends C251343mx {
    public final C53603GrI A00;
    public final C55677Hla A01;
    public final boolean A02;
    public final int A03 = R.dimen.clips_mega_card_center_video_width;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final C59619JQn A06;
    public final String A07;
    public final HashMap A08;
    public final HashMap A09;
    public final C62320sa A0A;
    public final C62320sa A0B;
    public final C62320sa A0C;
    public final boolean A0D;

    public final C251263mp A0X(AnonymousClass3Y5 r33) {
        AnonymousClass3Y5 r1 = r33;
        0qQ.A0B(r1, 0);
        Context A002 = C243803a8.A00(r1);
        C53603GrI grI = this.A00;
        AnonymousClass0Ud r3 = grI.A0B;
        AnonymousClass0Ud A012 = 106.A01(C51968G9o.A11(A002, (C266444Yx) r3.getValue()));
        C62320sa r4 = null;
        AnonymousClass11O.A03(19E.A01(), new C61860pz(new C58107ImT(r1, A012, (AnonymousClass4D7) null, 13), r3));
        2Wa A003 = C58703IwC.A00(r1, this, 48);
        Object A013 = C58703IwC.A01(r1, A003, new Object[0], 49);
        C243773a4.A00(r1, C58692Iw1.A00(A013, this, 34), C51970G9q.A1b());
        if (this.A0D) {
            AnonymousClass0iw r10 = this.A04;
            AnonymousClass3XV r0 = 2WX.A02;
            2WX A0D2 = C51974G9v.A0D((2WX) null, C51965G9l.A0c(AnonymousClass05K.A00, 0, C244013aV.A0C(r1, this.A03)), 100.0f, 0);
            boolean A1V = C51969G9p.A1V(A003);
            C59619JQn jQn = this.A06;
            MidCardClipsClickedAction midCardClipsClickedAction = grI.A01;
            JSG jsg = grI.A02;
            C62320sa r32 = this.A0B;
            if (A1V) {
                r4 = this.A0A;
            }
            MidCardLayoutType midCardLayoutType = grI.A05;
            HashMap hashMap = this.A09;
            int i = grI.A00;
            String str = grI.A08;
            return new C53874Gvf(A0D2, midCardClipsClickedAction, jsg, midCardLayoutType, r10, grI.A06, jQn, (String) null, (String) null, str, hashMap, r32, r4, A012, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding, R.dimen.account_discovery_bottom_gap, i, A1V);
        }
        UserSession userSession = this.A05;
        AnonymousClass0iw r8 = this.A04;
        HashMap hashMap2 = this.A08;
        AnonymousClass3XV r02 = 2WX.A02;
        2WX A0D3 = C51974G9v.A0D((2WX) null, C51965G9l.A0c(AnonymousClass05K.A00, 0, C244013aV.A0C(r1, this.A03)), 100.0f, 0);
        C59619JQn jQn2 = this.A06;
        boolean A1V2 = C51969G9p.A1V(A003);
        MidCardClipsClickedAction midCardClipsClickedAction2 = grI.A01;
        JSG jsg2 = grI.A02;
        C62320sa r2 = this.A0B;
        if (A1V2) {
            r4 = this.A0A;
        }
        C62320sa r12 = this.A0C;
        return new C53876Gvh(A0D3, midCardClipsClickedAction2, jsg2, r8, userSession, jQn2, grI, this.A07, hashMap2, grI.A0A, r2, r4, r12, A012, A1V2);
    }

    public C53872Gvd(AnonymousClass0iw r3, UserSession userSession, C59619JQn jQn, C53603GrI grI, C55677Hla hla, String str, HashMap hashMap, HashMap hashMap2, C62320sa r11, C62320sa r12, C62320sa r13, boolean z, boolean z2) {
        AnonymousClass7TG.A1O(userSession, r3);
        C51974G9v.A1N(jQn, hashMap, hashMap2);
        C51969G9p.A1P(hla, 13, str);
        this.A05 = userSession;
        this.A04 = r3;
        this.A0D = z;
        this.A00 = grI;
        this.A06 = jQn;
        this.A08 = hashMap;
        this.A09 = hashMap2;
        this.A0A = r11;
        this.A0C = r12;
        this.A0B = r13;
        this.A02 = z2;
        this.A01 = hla;
        this.A07 = str;
    }
}
