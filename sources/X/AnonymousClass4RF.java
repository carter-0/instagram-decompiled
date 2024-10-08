package X;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4RF  reason: invalid class name */
public final class AnonymousClass4RF {
    public Uri A00;
    public AnonymousClass4RG A01;
    public AnonymousClass4RH A02;
    public AnonymousClass4RI A03;
    public AnonymousClass4RP A04;
    public Object A05;
    public String A06;
    public String A07;
    public String A08;
    public List A09;
    public List A0A;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.4RK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.4RK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: X.4RJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.4RK} */
    /* JADX WARNING: type inference failed for: r4v1, types: [X.4RM, X.4RN] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r2.A03 != null) goto L_0x000b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4RL A00() {
        /*
            r10 = this;
            X.4RH r2 = r10.A02
            android.net.Uri r0 = r2.A00
            if (r0 == 0) goto L_0x000b
            java.util.UUID r1 = r2.A03
            r0 = 0
            if (r1 == 0) goto L_0x000c
        L_0x000b:
            r0 = 1
        L_0x000c:
            X.C256703wD.A04(r0)
            android.net.Uri r3 = r10.A00
            r4 = 0
            if (r3 == 0) goto L_0x004f
            java.lang.String r6 = r10.A08
            java.util.UUID r0 = r2.A03
            if (r0 == 0) goto L_0x001f
            X.5fM r4 = new X.5fM
            r4.<init>(r2)
        L_0x001f:
            java.util.List r8 = r10.A09
            java.lang.String r7 = r10.A06
            java.util.List r9 = r10.A0A
            java.lang.Object r5 = r10.A05
            X.4RJ r2 = new X.4RJ
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
        L_0x002c:
            X.4RL r0 = X.AnonymousClass4RL.A07
            java.lang.String r8 = r10.A07
            if (r8 != 0) goto L_0x0034
            java.lang.String r8 = ""
        L_0x0034:
            X.4RG r0 = r10.A01
            X.4RM r4 = new X.4RM
            r4.<init>(r0)
            X.4RI r0 = r10.A03
            X.4RO r5 = new X.4RO
            r5.<init>(r0)
            X.4RP r7 = r10.A04
            if (r7 != 0) goto L_0x0048
            X.4RP r7 = X.AnonymousClass4RP.A0V
        L_0x0048:
            X.4RL r3 = new X.4RL
            r6 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
        L_0x004f:
            r2 = r4
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4RF.A00():X.4RL");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.4RG] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.4RI, java.lang.Object] */
    public AnonymousClass4RF(AnonymousClass4RL r5) {
        this();
        AnonymousClass4RH r1;
        AnonymousClass4RN r3 = r5.A00;
        ? obj = new Object();
        obj.A01 = r3.A01;
        obj.A00 = r3.A00;
        obj.A03 = r3.A03;
        obj.A02 = r3.A02;
        obj.A04 = r3.A04;
        this.A01 = obj;
        this.A07 = r5.A06;
        this.A04 = r5.A05;
        AnonymousClass4RO r32 = r5.A02;
        ? obj2 = new Object();
        obj2.A04 = r32.A04;
        obj2.A03 = r32.A03;
        obj2.A02 = r32.A02;
        obj2.A01 = r32.A01;
        obj2.A00 = r32.A00;
        this.A03 = obj2;
        AnonymousClass4RK r12 = r5.A03;
        if (r12 != null) {
            this.A06 = r12.A03;
            this.A08 = r12.A04;
            this.A00 = r12.A00;
            this.A09 = r12.A05;
            this.A0A = r12.A06;
            this.A05 = r12.A02;
            C290465fM r2 = r12.A01;
            if (r2 != null) {
                r1.A03 = r2.A05;
                r1.A00 = r2.A00;
                r1.A02 = r2.A03;
                r1.A05 = r2.A08;
                r1.A06 = r2.A09;
                r1.A04 = r2.A07;
                r1.A01 = r2.A01;
                r1.A07 = r2.A0A;
            } else {
                r1 = new AnonymousClass4RH();
            }
            this.A02 = r1;
        }
    }

    public AnonymousClass4RF() {
        this.A01 = new AnonymousClass4RG();
        this.A02 = new AnonymousClass4RH();
        this.A09 = Collections.emptyList();
        this.A0A = Collections.emptyList();
        this.A03 = new AnonymousClass4RI();
    }
}
