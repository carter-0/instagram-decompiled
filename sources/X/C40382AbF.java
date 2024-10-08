package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.LinkedHashMap;

/* renamed from: X.AbF  reason: case insensitive filesystem */
public final class C40382AbF implements MTZ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass4D6 A02;
    public final /* synthetic */ 1GK A03;
    public final /* synthetic */ 1GK A04;
    public final /* synthetic */ LD4 A05;
    public final /* synthetic */ DirectShareTarget A06;
    public final /* synthetic */ C381779cJ A07;
    public final /* synthetic */ A6R A08;
    public final /* synthetic */ AnonymousClass3Q2 A09;
    public final /* synthetic */ C349307zv A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ LinkedHashMap A0D;
    public final /* synthetic */ boolean A0E;

    public C40382AbF(Context context, UserSession userSession, AnonymousClass4D6 r3, 1GK r4, 1GK r5, LD4 ld4, DirectShareTarget directShareTarget, C381779cJ r8, A6R a6r, AnonymousClass3Q2 r10, C349307zv r11, String str, String str2, LinkedHashMap linkedHashMap, boolean z) {
        this.A01 = userSession;
        this.A09 = r10;
        this.A00 = context;
        this.A0A = r11;
        this.A04 = r4;
        this.A03 = r5;
        this.A0D = linkedHashMap;
        this.A02 = r3;
        this.A0C = str;
        this.A05 = ld4;
        this.A06 = directShareTarget;
        this.A07 = r8;
        this.A0E = z;
        this.A0B = str2;
        this.A08 = a6r;
    }

    public final void DVt() {
        C59797JYq.A07(this.A00, this.A01, this.A09, "template_overlay_failed_to_save");
    }

    public final void DVu(String str) {
        ShareType shareType = ShareType.STORY_TEMPLATE_ASSET;
        UserSession userSession = this.A01;
        AnonymousClass3Q2 A032 = C59797JYq.A03(userSession, shareType);
        A032.A33 = str;
        AnonymousClass3Q2 r11 = this.A09;
        r11.A0X(A032);
        Context context = this.A00;
        C349307zv r13 = this.A0A;
        1GK r10 = this.A04;
        1GK r9 = this.A03;
        LinkedHashMap linkedHashMap = this.A0D;
        AnonymousClass4D6 r7 = this.A02;
        String str2 = this.A0C;
        LD4 ld4 = this.A05;
        DirectShareTarget directShareTarget = this.A06;
        C381779cJ r3 = this.A07;
        boolean z = this.A0E;
        String str3 = this.A0B;
        C349307zv r23 = r13;
        AnonymousClass3Q2 r22 = r11;
        A6R a6r = this.A08;
        C381779cJ r20 = r3;
        DirectShareTarget directShareTarget2 = directShareTarget;
        LD4 ld42 = ld4;
        UserSession userSession2 = userSession;
        KH3 kh3 = new KH3(context, userSession, r10, r9, new C65047LmR(context, (C53401GnY) null, userSession2, ld42, directShareTarget2, r20, a6r, r22, r23, (Boolean) null, str2, str3, (String) null, z), r11, linkedHashMap);
        if (r7 == null) {
            1ES.A03(kh3);
        } else {
            r7.schedule(kh3);
        }
    }
}
