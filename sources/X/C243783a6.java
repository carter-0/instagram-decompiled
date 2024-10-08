package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.user.model.User;

/* renamed from: X.3a6  reason: invalid class name and case insensitive filesystem */
public final class C243783a6 extends 0Yg implements C62320sa {
    public final /* synthetic */ C381829cQ A00;
    public final /* synthetic */ AnonymousClass3Y5 A01;
    public final /* synthetic */ 2Wa A02;
    public final /* synthetic */ AnonymousClass3ZH A03;
    public final /* synthetic */ C243683Zu A04;
    public final /* synthetic */ C243613Zn A05;
    public final /* synthetic */ C243553Zf A06;
    public final /* synthetic */ C243733a0 A07;
    public final /* synthetic */ AnonymousClass3ZE A08;
    public final /* synthetic */ C243503Za A09;
    public final /* synthetic */ AnonymousClass3W1 A0A;
    public final /* synthetic */ User A0B;
    public final /* synthetic */ boolean A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C243783a6(C381829cQ r2, AnonymousClass3Y5 r3, 2Wa r4, AnonymousClass3ZH r5, C243683Zu r6, C243613Zn r7, C243553Zf r8, C243733a0 r9, AnonymousClass3ZE r10, C243503Za r11, AnonymousClass3W1 r12, User user, boolean z) {
        super(0);
        this.A00 = r2;
        this.A08 = r10;
        this.A01 = r3;
        this.A06 = r8;
        this.A05 = r7;
        this.A04 = r6;
        this.A03 = r5;
        this.A0A = r12;
        this.A02 = r4;
        this.A07 = r9;
        this.A09 = r11;
        this.A0B = user;
        this.A0C = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        SpannableStringBuilder A002;
        C381829cQ r0 = this.A00;
        if (r0 != null) {
            Hashtag hashtag = (Hashtag) r0.A01;
            A002 = new SpannableStringBuilder();
            if (hashtag != null) {
                A002.append("#");
                A002.append(hashtag.getName());
                A002.setSpan(new CharacterStyle(), 0, A002.length(), 33);
            }
        } else {
            AnonymousClass3ZE r1 = this.A08;
            if (AnonymousClass9IU.A00(1, r1)) {
                Context A003 = C243803a8.A00(this.A01);
                UserSession userSession = this.A06.A00;
                int i = this.A04.A09;
                1Xj r5 = this.A03.A01;
                AnonymousClass3W1 r7 = this.A0A;
                A002 = C253153qI.A00(A003, (N4R) ((AnonymousClass9IU) r1).A01, userSession, r5, (C55504Him) this.A05.A01.getValue(), r7, i, r7.getPosition());
            } else if (AnonymousClass9IU.A00(2, r1)) {
                AnonymousClass53Z r52 = (AnonymousClass53Z) this.A05.A02.getValue();
                int position = this.A0A.getPosition();
                A002 = C253153qI.A01(C243803a8.A00(this.A01), this.A06.A00, this.A04, r52, (C381479bp) ((AnonymousClass9IU) r1).A01, position);
            } else if (AnonymousClass9IU.A00(0, r1)) {
                A002 = ((C56153Htf) this.A05.A07.getValue()).A01(C243803a8.A00(this.A01), (C53281GlT) ((AnonymousClass9IU) r1).A02, this.A0A.getPosition(), ((Number) this.A02.A03).intValue());
            } else if (r1 instanceof C243793a7) {
                C243793a7 r12 = (C243793a7) r1;
                AnonymousClass9J2 r2 = r12.A00;
                if (r2 != null) {
                    User user = this.A0B;
                    C243503Za r4 = this.A09;
                    AnonymousClass3Y5 r02 = this.A01;
                    boolean z = this.A0C;
                    A002 = C243553Zf.A00(C243803a8.A00(r02), r2, this.A04, r4, user, z);
                } else {
                    A002 = (SpannableStringBuilder) ((0sI) ((C53400GnX) r12.A01.A01).A00).invoke(this.A07, this.A09, Integer.valueOf(this.A0A.A02), this.A06.A02, this.A04);
                }
            } else if (r1 instanceof AnonymousClass3ZD) {
                AnonymousClass9J2 r13 = ((AnonymousClass3ZD) r1).A00;
                User user2 = this.A0B;
                C243503Za r3 = this.A09;
                A002 = C243553Zf.A00(C243803a8.A00(this.A01), r13, this.A04, r3, user2, this.A0C);
            } else {
                throw new RuntimeException();
            }
        }
        C243733a0 r14 = this.A07;
        if (r14.A01) {
            C253153qI.A07(C243803a8.A00(this.A01), A002, this.A04, r14.A00);
        }
        return A002;
    }
}
