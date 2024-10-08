package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import java.util.LinkedHashMap;
import java.util.Map;

public final class GKY implements C270694h9 {
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final 1L5 A0E;
    public final String A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;

    /* JADX WARNING: type inference failed for: r6v0, types: [X.4LS, java.lang.Object] */
    public final Map AUH(String str) {
        Map AUH;
        String str2 = str;
        0qQ.A0B(str, 0);
        long currentTimeMillis = System.currentTimeMillis();
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (!this.A0J || (!this.A0G && !this.A0H)) {
            G9t.A1Q(str, A1H, this.A09);
            A1H.putAll(C51971G9r.A0w(str, this.A0A));
            G9t.A1Q(str, A1H, this.A06);
            if (this.A0I) {
                G9t.A1Q(str, A1H, this.A04);
            }
            G9t.A1Q(str, A1H, this.A01);
            G9t.A1Q(str, A1H, this.A05);
            AUH = ((C228232l0) this.A00.getValue()).AUH(str);
        } else {
            G9t.A1P(str, A1H, this.A0C);
            if (this.A0H) {
                AUH = C51971G9r.A0w(str, this.A0A);
            }
            this.A0E.EGc(new Object(), this.A0F, str2, 00k.A0a(A1H.keySet()), 0Yt.A0B(A1H), (double) C51966G9m.A07(currentTimeMillis));
            return A1H;
        }
        A1H.putAll(AUH);
        this.A0E.EGc(new Object(), this.A0F, str2, 00k.A0a(A1H.keySet()), 0Yt.A0B(A1H), (double) C51966G9m.A07(currentTimeMillis));
        return A1H;
    }

    public GKY(1L5 r3, String str, C62320sa r5, C62320sa r6, C62320sa r7, C62320sa r8, C62320sa r9, C62320sa r10, C62320sa r11, C62320sa r12, C62320sa r13, C62320sa r14, C62320sa r15, C62320sa r16, C62320sa r17, C62320sa r18, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A0G = z;
        this.A0H = z2;
        this.A0J = z3;
        this.A0E = r3;
        this.A0F = str;
        this.A0I = z4;
        this.A0D = C51970G9q.A0o(r5, 41);
        this.A09 = C51970G9q.A0o(r6, 37);
        this.A05 = C51970G9q.A0o(r14, 33);
        this.A00 = C51970G9q.A0o(r15, 28);
        this.A0A = C51970G9q.A0o(r7, 38);
        this.A06 = C51970G9q.A0o(r8, 34);
        this.A04 = C51970G9q.A0o(r9, 32);
        this.A03 = C51970G9q.A0o(r10, 31);
        this.A02 = C51970G9q.A0o(r11, 30);
        this.A0B = C51970G9q.A0o(r12, 39);
        this.A01 = C51970G9q.A0o(r13, 29);
        this.A0C = C51970G9q.A0o(r16, 40);
        this.A07 = C51970G9q.A0o(r17, 35);
        this.A08 = C51970G9q.A0o(r18, 36);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.4LS, java.lang.Object] */
    public final Map AUI(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        G9t.A1Q(str, A1H, this.A0D);
        1L5 r5 = this.A0E;
        String str2 = this.A0F;
        r5.EGc(new Object(), str2, str, AnonymousClass7TE.A1I("xout"), 0Yt.A0B(A1H), (double) C51966G9m.A07(currentTimeMillis));
        return A1H;
    }

    public final /* bridge */ /* synthetic */ void DUE(C301165yf r3, C233162v9 r4, Object obj, Object obj2) {
        AnonymousClass0eM r0;
        C51974G9v.A1O(r4, obj, obj2, r3);
        switch (r4.ordinal()) {
            case 0:
                r0 = this.A02;
                break;
            case 1:
                r0 = this.A03;
                break;
            case 2:
                r0 = this.A04;
                break;
            case 5:
                r0 = this.A06;
                break;
            case 7:
                r0 = this.A09;
                break;
            case 11:
                r0 = this.A0B;
                break;
            case 16:
                r0 = this.A0D;
                break;
            case 26:
                r0 = this.A00;
                break;
            case 27:
                r0 = this.A05;
                break;
            case 28:
                r0 = this.A01;
                break;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                r0 = this.A07;
                break;
            case 30:
                r0 = this.A08;
                break;
            default:
                throw C51973G9u.A0g(r4, "Wrong signal type in RealtimeSignalProviderImpl for Clips: ", AnonymousClass7TE.A1A());
        }
        ((C228232l0) r0.getValue()).DUE(r3, r4, obj, obj2);
    }
}
