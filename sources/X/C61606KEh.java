package X;

import android.app.Application;
import com.instagram.common.session.UserSession;

/* renamed from: X.KEh  reason: case insensitive filesystem */
public final class C61606KEh extends C228042kh {
    public final Application A00;
    public final AnonymousClass07Z A01;
    public final AnonymousClass07g A02;
    public final 28D A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final C3499682q A06;
    public final C60304Jj3 A07;
    public final KO3 A08;
    public final C65172Lob A09;
    public final C60259JiG A0A;
    public final String A0B;

    public C61606KEh(Application application, AnonymousClass07Z r3, AnonymousClass07g r4, 28D r5, AnonymousClass0iw r6, UserSession userSession, C3499682q r8, C60304Jj3 jj3, KO3 ko3, C65172Lob lob, C60259JiG jiG, String str) {
        0qQ.A0B(userSession, 2);
        C51974G9v.A1N(lob, r6, str);
        DbW.A1P(r5, 8, jj3);
        this.A00 = application;
        this.A05 = userSession;
        this.A06 = r8;
        this.A08 = ko3;
        this.A09 = lob;
        this.A04 = r6;
        this.A0B = str;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A0A = jiG;
        this.A07 = jj3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: X.LSR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v0, resolved type: X.KO7} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ X.2YL create() {
        /*
            r57 = this;
            r11 = r57
            X.82q r3 = r11.A06
            r0 = r3
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            com.instagram.model.creation.MediaCaptureConfig r0 = r0.A09
            r1 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0125
            boolean r0 = r0.A04
            if (r0 != r1) goto L_0x0125
        L_0x0013:
            com.instagram.common.session.UserSession r10 = r11.A05
            X.KNo r23 = new X.KNo
            r0 = r23
            r0.<init>(r10, r3)
            X.KO3 r9 = r11.A08
            X.KOD r22 = new X.KOD
            r0 = r22
            r0.<init>(r10, r9)
            X.KOb r21 = new X.KOb
            r0 = r21
            r0.<init>(r10, r3, r9)
            X.Lob r4 = r11.A09
            android.app.Application r0 = r11.A00
            r56 = r0
            android.content.Context r13 = X.DbT.A05(r56)
            r0 = 1
            r6 = 2
            X.MP9 r2 = new X.MP9
            r2.<init>(r11, r6)
            X.KOp r48 = new X.KOp
            r12 = r48
            r14 = r10
            r15 = r4
            r16 = r9
            r17 = r2
            r18 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            X.KOC r20 = new X.KOC
            r2 = r20
            r2.<init>(r10, r9)
            X.KOQ r19 = new X.KOQ
            r2 = r19
            r2.<init>(r9)
            X.KOc r18 = new X.KOc
            r2 = r18
            r2.<init>(r10, r9)
            X.KOU r17 = new X.KOU
            r2 = r17
            r2.<init>(r9)
            X.KON r16 = new X.KON
            r2 = r16
            r2.<init>(r9)
            X.Jj3 r2 = r11.A07
            r25 = r2
            X.KWg r2 = r2.A02
            X.KOO r15 = new X.KOO
            r15.<init>(r10, r9, r2)
            X.KgC r2 = X.C62462KgC.FEED
            X.KOI r14 = new X.KOI
            r14.<init>(r10, r2, r9, r5)
            X.0iw r2 = r11.A04
            r13 = r2
            android.content.Context r51 = X.DbT.A05(r56)
            X.LPH r2 = r4.A00
            X.KOm r50 = new X.KOm
            r52 = r2
            r53 = r13
            r54 = r10
            r55 = r9
            r50.<init>(r51, r52, r53, r54, r55)
            X.KOd r12 = new X.KOd
            r12.<init>(r10, r9)
            java.lang.String r2 = r11.A0B
            X.KOj r8 = new X.KOj
            r8.<init>(r10, r3, r9, r2)
            X.KOF r7 = new X.KOF
            r7.<init>(r9, r1)
            X.KO8 r6 = new X.KO8
            r6.<init>(r9)
            X.KOX r5 = new X.KOX
            r5.<init>(r10, r9, r1)
            X.28D r1 = r11.A03
            X.KOe r4 = new X.KOe
            r4.<init>(r1, r10, r9)
            X.07g r2 = r11.A02
            X.KCf r1 = new X.KCf
            r1.<init>(r10, r9)
            X.2YN r2 = X.JTO.A0L(r1, r2)
            java.lang.Class<X.JjG> r1 = X.C60313JjG.class
            X.2YL r1 = r2.A00(r1)
            X.JjG r1 = (X.C60313JjG) r1
            X.KOP r3 = new X.KOP
            r3.<init>(r10, r9, r1)
            X.0qQ.A0B(r9, r0)
            X.KO7 r2 = new X.KO7
            r2.<init>(r9)
            java.lang.String r0 = r13.getModuleName()
            X.KOM r1 = new X.KOM
            r1.<init>(r10, r9, r0)
            X.KOf r0 = new X.KOf
            r0.<init>(r10, r9)
            X.07Z r13 = r11.A01
            X.JiG r11 = r11.A0A
            X.KNr r24 = new X.KNr
            r37 = r22
            r38 = r15
            r39 = r3
            r40 = r2
            r41 = r11
            r42 = r19
            r43 = r18
            r44 = r17
            r45 = r14
            r46 = r0
            r47 = r1
            r49 = r16
            r51 = r7
            r52 = r12
            r26 = r13
            r27 = r10
            r28 = r25
            r29 = r9
            r30 = r23
            r31 = r5
            r32 = r20
            r33 = r4
            r34 = r21
            r35 = r6
            r36 = r8
            r25 = r56
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            return r24
        L_0x0125:
            r1 = 0
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61606KEh.create():X.2YL");
    }
}
