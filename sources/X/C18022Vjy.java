package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Vjy  reason: case insensitive filesystem */
public final class C18022Vjy {
    public char A00;
    public char A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public int A08;
    public int A09;
    public int A0A;
    public C16495Uvr A0B;
    public char[] A0C = new char[0];
    public final C17828Vgh A0D;
    public final Map A0E = new HashMap();
    public final char[] A0F;

    public final void A01(C16494Uvq uvq, char c) {
        int i;
        int i2;
        int i3;
        0qQ.A0B(uvq, 1);
        this.A01 = c;
        this.A06 = this.A04;
        this.A07 = this.A0D.A00(c);
        this.A0C = null;
        char c2 = this.A00;
        Map map = this.A0E;
        Character valueOf = Character.valueOf(c2);
        if (map.containsKey(valueOf)) {
            Object obj = map.get(valueOf);
            if (obj != null) {
                i = AnonymousClass7TE.A0M(obj) + 1;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else {
            i = -1;
        }
        Character valueOf2 = Character.valueOf(this.A01);
        if (map.containsKey(valueOf2)) {
            Object obj2 = map.get(valueOf2);
            if (obj2 != null) {
                i2 = AnonymousClass7TE.A0M(obj2) + 1;
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else {
            i2 = -1;
        }
        if (this.A0B == C16495Uvr.STRAIGHT_TO_TARGET || i < 0 || i2 < 0) {
            char c3 = this.A00;
            char c4 = this.A01;
            i3 = 1;
            if (c3 == c4) {
                this.A0C = new char[]{c3};
                this.A0A = 0;
            } else {
                int ordinal = uvq.ordinal();
                if (ordinal == 0) {
                    this.A0C = new char[]{c4, c3};
                    this.A0A = 1;
                } else if (ordinal == 1) {
                    this.A0C = new char[]{c3, c4};
                    this.A0A = 0;
                    this.A09 = i3;
                } else {
                    throw new RuntimeException();
                }
            }
            this.A09 = 0;
        } else {
            this.A0A = i;
            this.A09 = i2;
            this.A0C = this.A0F;
            if (uvq == C16494Uvq.UP) {
                if (i < i2) {
                    this.A0A = i + 10;
                }
            } else if (i2 < i) {
                i3 = i2 + 10;
                this.A09 = i3;
            }
        }
        this.A05 = this.A03;
        this.A03 = 0.0f;
    }

    public final void A00() {
        float A002 = this.A0D.A00(this.A01);
        float f = this.A04;
        float f2 = this.A07;
        if (f == f2 && f2 != A002) {
            this.A07 = A002;
            this.A04 = A002;
        }
    }

    public C18022Vjy(C16495Uvr uvr, C17828Vgh vgh) {
        int i;
        AnonymousClass7TG.A1O(vgh, uvr);
        this.A0D = vgh;
        this.A0B = uvr;
        int i2 = 0;
        for (int i3 = 0; i3 < 10; i3++) {
            this.A0E.put(Character.valueOf("9876543210".charAt(i3)), Integer.valueOf(i3));
        }
        char[] cArr = new char[21];
        this.A0F = cArr;
        cArr[0] = 0;
        do {
            i = i2 + 1;
            this.A0F[i] = "9876543210".charAt(i2);
            this.A0F[i2 + 11] = "9876543210".charAt(i2);
            i2 = i;
        } while (i < 10);
    }
}
