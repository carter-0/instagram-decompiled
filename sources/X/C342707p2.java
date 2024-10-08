package X;

import android.graphics.Rect;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.7p2  reason: invalid class name and case insensitive filesystem */
public final class C342707p2 extends C342717p3 implements Cloneable {
    public Rect A00;
    public Rect A01;
    public C343047pa A02;
    public C343047pa A03;
    public C343047pa A04;
    public C343047pa A05;
    public C343047pa A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Boolean A0F;
    public Boolean A0G;
    public Boolean A0H;
    public Boolean A0I;
    public Boolean A0J;
    public Boolean A0K;
    public Boolean A0L;
    public Double A0M;
    public Double A0N;
    public Double A0O;
    public Float A0P;
    public Float A0Q;
    public Float A0R;
    public Integer A0S;
    public Integer A0T;
    public Integer A0U;
    public Integer A0V;
    public Integer A0W;
    public Integer A0X;
    public Integer A0Y;
    public Integer A0Z;
    public Integer A0a;
    public Integer A0b;
    public Integer A0c;
    public Integer A0d;
    public Integer A0e;
    public Integer A0f;
    public Integer A0g;
    public Integer A0h;
    public Integer A0i;
    public Long A0j;
    public Long A0k;
    public Long A0l;
    public String A0m;
    public HashMap A0n;
    public List A0o;
    public List A0p;
    public float[] A0q;
    public int[] A0r;
    public final int[] A0s = new int[2];
    public final C342687p0 A0t;

    public final void A03(C342727p4 r5, Object obj) {
        int i = r5.A00;
        Rect rect = null;
        int i2 = 0;
        switch (i) {
            case 0:
                this.A0A = (Boolean) obj;
                return;
            case 1:
                this.A0L = (Boolean) obj;
                return;
            case 2:
                if (((Boolean) this.A0t.A01(C342687p0.A0K)).booleanValue()) {
                    obj.getClass();
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    int i3 = 0;
                    if (booleanValue) {
                        i3 = 17;
                    }
                    A03(C342717p3.A0s, Integer.valueOf(i3));
                    if (booleanValue) {
                        A03(C342717p3.A0r, false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                this.A0K = (Boolean) obj;
                return;
            case 4:
                this.A0H = (Boolean) obj;
                return;
            case 5:
                this.A0E = (Boolean) obj;
                return;
            case 6:
                this.A07 = (Boolean) obj;
                return;
            case 8:
                this.A0J = (Boolean) obj;
                return;
            case 9:
                this.A0Y = (Integer) obj;
                return;
            case 10:
                obj.getClass();
                int intValue = ((Number) obj).intValue();
                if (intValue != -1) {
                    i2 = intValue;
                }
                this.A0X = Integer.valueOf(i2);
                return;
            case 11:
                this.A0S = (Integer) obj;
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                this.A0U = (Integer) obj;
                return;
            case 13:
                this.A0W = (Integer) obj;
                return;
            case 14:
                this.A0a = (Integer) obj;
                return;
            case 15:
                this.A0b = (Integer) obj;
                return;
            case 17:
                this.A0e = (Integer) obj;
                return;
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 52:
                return;
            case 19:
                this.A0f = (Integer) obj;
                return;
            case 21:
                this.A0d = (Integer) obj;
                return;
            case 22:
                this.A0Z = (Integer) obj;
                return;
            case 23:
                this.A0g = (Integer) obj;
                return;
            case 24:
                this.A0h = (Integer) obj;
                return;
            case 25:
                this.A0i = (Integer) obj;
                return;
            case 26:
                this.A0R = (Float) obj;
                return;
            case 27:
                this.A0k = (Long) obj;
                return;
            case 30:
                this.A0M = (Double) obj;
                return;
            case 31:
                this.A0O = (Double) obj;
                return;
            case 32:
                this.A0N = (Double) obj;
                return;
            case 33:
                C343047pa r6 = (C343047pa) obj;
                this.A04 = r6;
                if (r6 != null) {
                    rect = new Rect(0, 0, r6.A02, r6.A01);
                }
                this.A01 = rect;
                return;
            case 34:
                C343047pa r62 = (C343047pa) obj;
                this.A03 = r62;
                if (r62 != null) {
                    rect = new Rect(0, 0, r62.A02, r62.A01);
                }
                this.A00 = rect;
                return;
            case 35:
                this.A05 = (C343047pa) obj;
                return;
            case 36:
                this.A02 = (C343047pa) obj;
                return;
            case 37:
                this.A0o = C14253Tsb.A00((List) obj);
                return;
            case 38:
                this.A0p = C14253Tsb.A00((List) obj);
                return;
            case 39:
                int[] iArr = (int[]) obj;
                if (iArr != null && iArr.length == 2) {
                    int[] iArr2 = this.A0s;
                    iArr2[0] = iArr[0];
                    iArr2[1] = iArr[1];
                    return;
                }
                return;
            case Seq.RefTracker.REF_OFFSET:
                this.A0m = (String) obj;
                return;
            case 44:
                this.A0D = (Boolean) obj;
                return;
            case 45:
                this.A08 = (Boolean) obj;
                return;
            case 46:
                this.A0j = (Long) obj;
                return;
            case 47:
                this.A0V = (Integer) obj;
                return;
            case 48:
                this.A0P = (Float) obj;
                return;
            case 49:
                this.A0q = (float[]) obj;
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                this.A0T = (Integer) obj;
                return;
            case 51:
                this.A0r = (int[]) obj;
                return;
            case 53:
                this.A09 = (Boolean) obj;
                return;
            case 54:
                this.A0Q = (Float) obj;
                return;
            case 55:
                this.A0n = (HashMap) obj;
                return;
            case 56:
                this.A0B = (Boolean) obj;
                return;
            case 58:
                this.A06 = (C343047pa) obj;
                return;
            case 60:
                this.A0I = (Boolean) obj;
                return;
            case 62:
                this.A0l = (Long) obj;
                return;
            case 63:
                this.A0F = (Boolean) obj;
                return;
            case 64:
                this.A0G = (Boolean) obj;
                return;
            case 65:
                this.A0c = (Integer) obj;
                return;
            default:
                throw new RuntimeException(002.A0O("Cannot directly set: ", i));
        }
    }

    public final boolean A04(C343147pk r5) {
        boolean z;
        if (r5.A10) {
            A03(C342717p3.A0B, Integer.valueOf(r5.A0B));
            z = true;
        } else {
            z = false;
        }
        if (r5.A0w) {
            A03(C342717p3.A09, Integer.valueOf(r5.A0A));
            z = true;
        }
        if (r5.A1F) {
            A03(C342717p3.A0W, Boolean.valueOf(r5.A1E));
            z = true;
        }
        if (r5.A1i) {
            A03(C342717p3.A0Z, Boolean.valueOf(r5.A1h));
            z = true;
        }
        if (r5.A1Z) {
            A03(C342717p3.A0Y, Boolean.valueOf(r5.A1Y));
            z = true;
        }
        if (r5.A1Q) {
            A03(C342717p3.A0X, Boolean.valueOf(r5.A1P));
            z = true;
        }
        if (r5.A1b) {
            A03(C342717p3.A0r, Boolean.valueOf(r5.A1a));
            z = true;
        }
        if (r5.A0l) {
            A03(C342717p3.A0P, Boolean.valueOf(r5.A0k));
            z = true;
        }
        if (r5.A0p) {
            A03(C342717p3.A0R, Boolean.valueOf(r5.A0o));
            z = true;
        }
        if (r5.A1W) {
            A03(C342717p3.A0o, Integer.valueOf(r5.A0K));
            z = true;
        }
        if (r5.A1V) {
            A03(C342717p3.A0n, r5.A1o);
            z = true;
        }
        if (r5.A12) {
            A03(C342717p3.A0D, Integer.valueOf(r5.A0C));
            z = true;
        }
        if (r5.A0j) {
            A03(C342717p3.A0O, Boolean.valueOf(r5.A0i));
            z = true;
        }
        if (r5.A1M) {
            A03(C342717p3.A0d, Float.valueOf(r5.A04));
            z = true;
        }
        if (r5.A14) {
            A03(C342717p3.A0U, Boolean.valueOf(r5.A13));
            z = true;
        }
        if (r5.A0f) {
            A03(C342717p3.A0M, Boolean.valueOf(r5.A0e));
            z = true;
        }
        if (r5.A0d) {
            A03(C342717p3.A02, r5.A0Y);
            z = true;
        }
        if (r5.A1j) {
            A03(C342717p3.A0z, Integer.valueOf(r5.A0N));
            z = true;
        }
        if (r5.A0b) {
            A03(C342717p3.A00, Integer.valueOf(r5.A06));
            z = true;
        }
        if (r5.A0t) {
            A03(C342717p3.A07, Integer.valueOf(r5.A08));
            z = true;
        }
        if (r5.A1J) {
            A03(C342717p3.A0a, Integer.valueOf(r5.A0E));
            z = true;
        }
        if (r5.A1K) {
            A03(C342717p3.A0b, Integer.valueOf(r5.A0F));
            z = true;
        }
        if (r5.A1L) {
            A03(C342717p3.A0c, r5.A0S);
            z = true;
        }
        if (r5.A1S) {
            A03(C342717p3.A0i, Integer.valueOf(r5.A0I));
            z = true;
        }
        if (r5.A1R) {
            A03(C342717p3.A0g, Integer.valueOf(r5.A0H));
            z = true;
        }
        if (r5.A1I) {
            A03(C342717p3.A0L, Integer.valueOf(r5.A0D));
            z = true;
        }
        if (r5.A0z) {
            A03(C342717p3.A0A, Long.valueOf(r5.A0P));
            z = true;
        }
        if (r5.A0u) {
            A03(C342717p3.A08, Integer.valueOf(r5.A09));
            z = true;
        }
        if (r5.A0c) {
            A03(C342717p3.A01, Float.valueOf(r5.A03));
            z = true;
        }
        if (r5.A0q) {
            A03(C342717p3.A04, r5.A1m);
            z = true;
        }
        if (r5.A0r) {
            A03(C342717p3.A05, Integer.valueOf(r5.A07));
            z = true;
        }
        if (r5.A0s) {
            A03(C342717p3.A06, r5.A1n);
            z = true;
        }
        if (r5.A1c) {
            A03(C342717p3.A0s, Integer.valueOf(r5.A0L));
            z = true;
        }
        if (r5.A1l) {
            A03(C342717p3.A11, Integer.valueOf(r5.A0O));
            z = true;
        }
        if (r5.A1d) {
            A03(C342717p3.A0t, Float.valueOf(r5.A05));
            z = true;
        }
        if (r5.A19) {
            A03(C342717p3.A0I, Long.valueOf(r5.A0Q));
            z = true;
        }
        if (r5.A15) {
            A03(C342717p3.A0E, Double.valueOf(r5.A00));
            z = true;
        }
        if (r5.A17) {
            A03(C342717p3.A0G, Double.valueOf(r5.A02));
            z = true;
        }
        if (r5.A16) {
            A03(C342717p3.A0F, Double.valueOf(r5.A01));
            z = true;
        }
        if (r5.A18) {
            A03(C342717p3.A0H, r5.A0X);
            z = true;
        }
        if (r5.A11) {
            A03(C342717p3.A0C, r5.A0Z);
            z = true;
        }
        if (r5.A1O) {
            A03(C342717p3.A0f, r5.A0a);
            z = true;
        }
        if (r5.A1X) {
            A03(C342717p3.A0q, r5.A0U);
            z = true;
        }
        if (r5.A1T) {
            A03(C342717p3.A0k, r5.A0T);
            z = true;
        }
        if (r5.A1k) {
            A03(C342717p3.A10, r5.A0W);
            z = true;
        }
        if (r5.A1g) {
            A03(C342717p3.A0y, r5.A0V);
            z = true;
        }
        if (r5.A0y) {
            A03(C342717p3.A0S, Boolean.valueOf(r5.A0x));
            z = true;
        }
        if (r5.A0h) {
            A03(C342717p3.A0N, Boolean.valueOf(r5.A0g));
            z = true;
        }
        if (r5.A0v) {
            A03(C342717p3.A0l, (Object) null);
            z = true;
        }
        if (r5.A0n) {
            A03(C342717p3.A0Q, Boolean.valueOf(r5.A0m));
            z = true;
        }
        if (r5.A1N) {
            A03(C342717p3.A0e, Integer.valueOf(r5.A0G));
            z = true;
        }
        if (r5.A1e) {
            A03(C342717p3.A0v, Long.valueOf(r5.A0R));
            z = true;
        }
        if (r5.A1B) {
            A03(C342717p3.A0J, Boolean.valueOf(r5.A1A));
            z = true;
        }
        if (!r5.A1D) {
            return z;
        }
        A03(C342717p3.A0K, Boolean.valueOf(r5.A1C));
        return true;
    }

    public C342707p2(C342687p0 r8) {
        List list = Collections.EMPTY_LIST;
        this.A0o = list;
        this.A0p = list;
        this.A0X = 0;
        this.A0i = 0;
        this.A0R = Float.valueOf(-1.0f);
        this.A0W = 0;
        this.A0K = false;
        this.A0H = false;
        this.A0I = false;
        this.A0J = false;
        this.A0A = false;
        this.A0L = false;
        this.A0E = false;
        this.A07 = false;
        this.A0n = new HashMap();
        this.A0D = false;
        this.A08 = true;
        this.A0Y = 0;
        this.A0h = -1;
        this.A0S = 0;
        this.A0U = 0;
        this.A0a = 0;
        this.A0b = 0;
        this.A0e = 0;
        this.A0f = 0;
        this.A0d = 0;
        this.A0Z = 0;
        this.A0j = 0L;
        Float valueOf = Float.valueOf(0.0f);
        this.A0P = valueOf;
        this.A0T = 1;
        this.A0g = 0;
        this.A0V = 1;
        this.A0k = 0L;
        Double valueOf2 = Double.valueOf(0.0d);
        this.A0M = valueOf2;
        this.A0O = valueOf2;
        this.A0N = valueOf2;
        this.A0m = "";
        this.A09 = true;
        this.A0Q = valueOf;
        this.A0B = false;
        this.A0c = 0;
        this.A0C = false;
        this.A0t = r8;
    }

    public final Object clone() {
        return super.clone();
    }
}
