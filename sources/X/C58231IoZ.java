package X;

import android.animation.TimeInterpolator;
import android.content.ContentResolver;
import android.content.Context;
import com.facebook.dsp.core.OpacityData;
import com.instagram.common.gallery.Medium;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.IoZ  reason: case insensitive filesystem */
public final class C58231IoZ extends 0Yg implements C62320sa {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58231IoZ(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        super(0);
        this.A00 = i2;
        this.A05 = obj;
        this.A03 = obj2;
        this.A07 = obj3;
        this.A01 = i;
        this.A06 = obj4;
        this.A04 = obj5;
        this.A02 = obj6;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap linkedHashMap;
        if (this.A00 != 0) {
            TimeInterpolator timeInterpolator = C52689Gb1.A09;
            boolean CRB = ((C59535JNh) this.A05).CRB();
            C53793GuM guM = (C53793GuM) this.A07;
            int i = guM.A00;
            int i2 = this.A01;
            float A022 = C51969G9p.A02((AnonymousClass3Y5) this.A06, guM.A01);
            0eP r2 = (0eP) this.A04;
            C361838gt r3 = (C361838gt) this.A02;
            C54642HLz hLz = (C54642HLz) r2.A00;
            boolean A1Z = AnonymousClass7TG.A1Z(r3, hLz);
            OpacityData E0e = C21115XFf.A00(r3).E0e(hLz);
            C54642HLz hLz2 = (C54642HLz) r2.A01;
            0qQ.A0B(hLz2, A1Z ? 1 : 0);
            C52692Gb4 A002 = C52692Gb4.A00(E0e.A00, C21115XFf.A00(r3).E0e(hLz2).A00);
            0qQ.A0B(hLz, A1Z);
            return new C52689Gb1(A002, C52692Gb4.A00(C21115XFf.A00(r3).E0e(hLz).A01, C21115XFf.A00(r3).E0e(hLz2).A01), (C52733Gbk) this.A03, A022, i, i2, CRB);
        }
        0rm r32 = (0rm) this.A05;
        ContentResolver contentResolver = ((Context) this.A02).getContentResolver();
        0qQ.A07(contentResolver);
        0rk r22 = (0rk) this.A07;
        ArrayList A012 = C358038aG.A01(contentResolver, (AnonymousClass8XO) this.A06, (List) this.A04, 50, r22.A00, this.A01, 0, -1, -1, false, false);
        r32.A00 = A012;
        AnonymousClass8XR r6 = (AnonymousClass8XR) this.A03;
        ArrayList A0p = AnonymousClass7TF.A0p(A012);
        Iterator it = A012.iterator();
        while (it.hasNext()) {
            A0p.add(String.valueOf(((Medium) it.next()).A05));
        }
        C347927xb r62 = new C347927xb(r6.A00);
        try {
            1W6 CGp = r62.A00.CGp();
            0qQ.A0B(CGp, 1);
            List A003 = A0E.A00(CGp, A0p);
            int A0L = 0se.A0L(0Yv.A1E(A003, 10));
            if (A0L < 16) {
                A0L = 16;
            }
            linkedHashMap = DbS.A0x(A0L);
            for (Object next : A003) {
                String str = ((C358058aI) next).A0L;
                if (str != null) {
                    linkedHashMap.put(str, next);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        } catch (Exception e) {
            0KC.A0F(AnonymousClass000.A00(2286), "getMetadataMap failed", e);
            linkedHashMap = 0Yt.A0E();
        } catch (Throwable th) {
            r62.A00.close();
            throw th;
        }
        r62.A00.close();
        for (Medium A004 : (Iterable) r32.A00) {
            AnonymousClass8XR.A00(A004, linkedHashMap);
        }
        r22.A00 += DbS.A05(r32.A00);
        ((List) r32.A00).size();
        return C60340gF.A00;
    }
}
