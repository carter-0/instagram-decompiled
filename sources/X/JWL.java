package X;

import android.content.Context;
import android.database.DataSetObserver;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class JWL implements C361678gc {
    public 0sP A00;
    public DataSetObserver A01;
    public final Context A02;
    public final AnonymousClass9IV A03;
    public final AnonymousClass0iw A04;
    public final AnonymousClass8XV A05;
    public final C355608Qq A06;
    public final AnonymousClass2t9 A07;
    public final UserSession A08;
    public final JWM A09;
    public final C59753JWq A0A;
    public final boolean A0B;

    public final int AJv(int i) {
        return DbX.A02((Number) C51968G9o.A10(this.A09.A04, i));
    }

    public final int AJz(int i) {
        return DbX.A02((Number) C51968G9o.A10(this.A09.A05, i));
    }

    public final int Bom() {
        return this.A09.A01;
    }

    public final void Dmz() {
        List list = this.A09.A03;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (next instanceof C232262tL) {
                A1C.add(next);
            }
        }
        ViewModelListUpdate A0R = DbS.A0R();
        A0R.A01(A1C);
        this.A07.A05(A0R);
        DataSetObserver dataSetObserver = this.A01;
        if (dataSetObserver != null) {
            dataSetObserver.onChanged();
        }
    }

    public final int getItemCount() {
        return this.A09.A03.size();
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [X.2tF, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v12, types: [X.8i1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public JWL(android.content.Context r15, X.AnonymousClass9IV r16, X.AnonymousClass0iw r17, X.AnonymousClass8XV r18, X.C355608Qq r19, com.instagram.common.session.UserSession r20, X.JWM r21, X.C59753JWq r22, boolean r23) {
        /*
            r14 = this;
            r14.<init>()
            r0 = r21
            r14.A09 = r0
            r0 = r16
            r14.A03 = r0
            r0 = r23
            r14.A0B = r0
            r0 = r19
            r14.A06 = r0
            r0 = r18
            r14.A05 = r0
            r0 = r22
            r14.A0A = r0
            r7 = r20
            r14.A08 = r7
            r14.A02 = r15
            r0 = r17
            r14.A04 = r0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321060953859110(0x8109d000052426, double:3.0329234281693104E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x00e9
            X.JbU r8 = new X.JbU
            r8.<init>(r14)
            X.9IV r4 = r14.A03
            X.8Qq r6 = r14.A06
            X.Jbn r10 = X.C59924Jbn.A00
            r5 = 0
            X.8i1 r3 = new X.8i1
            r9 = r5
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
        L_0x0044:
            android.content.Context r2 = r14.A02
            X.2tC r0 = X.AnonymousClass2t9.A00(r2)
            r0.A01(r3)
            java.lang.Object r6 = r4.A01
            X.9Ii r6 = (X.C376529Ii) r6
            X.8XV r10 = r14.A05
            X.JWq r1 = r14.A0A
            r3 = 22
            X.MId r12 = X.JTO.A1C(r1, r3)
            r3 = 23
            X.MId r13 = X.JTO.A1C(r1, r3)
            X.JWs r8 = new X.JWs
            r9 = r6
            r11 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            r0.A01(r8)
            X.JWr r12 = new X.JWr
            r12.<init>(r14)
            X.0iw r10 = r14.A04
            X.JXK r13 = X.JXK.A00
            X.8gf r8 = new X.8gf
            r9 = r4
            r8.<init>(r9, r10, r11, r12, r13)
            r0.A01(r8)
            r3 = 24
            X.MId r8 = X.JTO.A1C(r1, r3)
            r3 = 25
            X.MId r9 = X.JTO.A1C(r1, r3)
            r3 = 19
            X.MIh r11 = new X.MIh
            r11.<init>(r1, r3)
            X.0sP r10 = r14.A00
            X.JWt r5 = new X.JWt
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.A01(r5)
            r3 = 26
            X.MId r5 = X.JTO.A1C(r1, r3)
            r3 = 27
            X.MId r4 = X.JTO.A1C(r1, r3)
            X.JWw r3 = new X.JWw
            r3.<init>(r6, r5, r4)
            r0.A01(r3)
            r4 = 2
            X.MBb r3 = new X.MBb
            r3.<init>(r1, r4)
            X.JWu r1 = new X.JWu
            r1.<init>(r3)
            r0.A01(r1)
            X.JWv r1 = new X.JWv
            r1.<init>(r7, r2)
            r0.A01(r1)
            X.JWM r3 = r14.A09
            boolean r2 = r14.A0B
            X.JWx r1 = new X.JWx
            r1.<init>(r7, r3, r2)
            r0.A01(r1)
            X.JWy r1 = new X.JWy
            r1.<init>()
            r0.A01(r1)
            r2 = 1
            r0.A09 = r2
            java.lang.String r1 = "GalleryPickerIgRecyclerAdapter"
            r0.A06 = r1
            X.2t9 r0 = r0.A00()
            r0.setHasStableIds(r2)
            r14.A07 = r0
            return
        L_0x00e9:
            X.8Qq r10 = r14.A06
            X.9IV r4 = r14.A03
            java.lang.Object r9 = r4.A01
            X.9Ii r9 = (X.C376529Ii) r9
            X.JWq r1 = r14.A0A
            r0 = 28
            X.MId r12 = X.JTO.A1C(r1, r0)
            r0 = 29
            X.MId r13 = X.JTO.A1C(r1, r0)
            X.JXR r3 = new X.JXR
            r8 = r3
            r11 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x0044
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JWL.<init>(android.content.Context, X.9IV, X.0iw, X.8XV, X.8Qq, com.instagram.common.session.UserSession, X.JWM, X.JWq, boolean):void");
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.A01 = dataSetObserver;
    }
}
