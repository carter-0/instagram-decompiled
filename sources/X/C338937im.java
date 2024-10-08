package X;

import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.model.FundraiserSharedToLive;

/* renamed from: X.7im  reason: invalid class name and case insensitive filesystem */
public final class C338937im extends 0Yg implements C62320sa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ AnonymousClass4DH A02;
    public final /* synthetic */ AnonymousClass82W A03;
    public final /* synthetic */ AnonymousClass0iw A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ C357638Yz A06;
    public final /* synthetic */ AnonymousClass8E7 A07;
    public final /* synthetic */ C41837B2s A08;
    public final /* synthetic */ C353398Hl A09;
    public final /* synthetic */ FundraiserSharedToLive A0A;
    public final /* synthetic */ AnonymousClass3NV A0B;
    public final /* synthetic */ Boolean A0C;
    public final /* synthetic */ Long A0D;
    public final /* synthetic */ String A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C338937im(ViewGroup viewGroup, AnonymousClass4DH r3, AnonymousClass82W r4, AnonymousClass0iw r5, UserSession userSession, C357638Yz r7, AnonymousClass8E7 r8, C41837B2s b2s, C353398Hl r10, FundraiserSharedToLive fundraiserSharedToLive, AnonymousClass3NV r12, Boolean bool, Long l, String str, int i) {
        super(0);
        this.A05 = userSession;
        this.A02 = r3;
        this.A07 = r8;
        this.A06 = r7;
        this.A08 = b2s;
        this.A01 = viewGroup;
        this.A00 = i;
        this.A09 = r10;
        this.A04 = r5;
        this.A03 = r4;
        this.A0A = fundraiserSharedToLive;
        this.A0B = r12;
        this.A0E = str;
        this.A0C = bool;
        this.A0D = l;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        UserSession userSession = this.A05;
        boolean A062 = 182.A06(0Tu.A05, userSession, 36322817595156938L);
        AnonymousClass4DH r2 = this.A02;
        if (A062) {
            AnonymousClass8E8 A002 = this.A07.A00();
            C357638Yz r6 = this.A06;
            C41837B2s b2s = this.A08;
            ViewGroup viewGroup = this.A01;
            int i = this.A00;
            C353398Hl r9 = this.A09;
            return new C64710Lgj(viewGroup, r2, this.A03, this.A04, userSession, r6, A002, b2s, r9, i);
        }
        AnonymousClass8E7 r7 = this.A07;
        C357638Yz r62 = this.A06;
        C41837B2s b2s2 = this.A08;
        ViewGroup viewGroup2 = this.A01;
        int i2 = this.A00;
        C353398Hl r92 = this.A09;
        AnonymousClass0iw r4 = this.A04;
        FundraiserSharedToLive fundraiserSharedToLive = this.A0A;
        AnonymousClass3NV r11 = this.A0B;
        String str = this.A0E;
        return new C339297jN(viewGroup2, r2, this.A03, r4, userSession, r62, r7, b2s2, r92, fundraiserSharedToLive, r11, this.A0C, this.A0D, str, i2);
    }
}
