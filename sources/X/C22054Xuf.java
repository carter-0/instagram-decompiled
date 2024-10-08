package X;

import java.util.List;

/* renamed from: X.Xuf  reason: case insensitive filesystem */
public class C22054Xuf implements C270334gZ {
    public int A00;
    public int A01 = 1;
    public int A02;
    public C270334gZ A03 = null;
    public XGS A04 = null;
    public C270324gY A05;
    public Integer A06 = AnonymousClass05K.A00;
    public List A07 = AnonymousClass7TE.A1C();
    public List A08 = AnonymousClass7TE.A1C();
    public boolean A09 = false;
    public boolean A0A = false;
    public boolean A0B = false;

    public final void A01() {
        this.A08.clear();
        this.A07.clear();
        this.A0B = false;
        this.A02 = 0;
        this.A0A = false;
        this.A09 = false;
    }

    public final void A02(int i) {
        if (!this.A0B) {
            this.A0B = true;
            this.A02 = i;
            for (C270334gZ r0 : this.A07) {
                r0.FJM(r0);
            }
        }
    }

    public final void A03(C270334gZ r2) {
        this.A07.add(r2);
        if (this.A0B) {
            r2.FJM(r2);
        }
    }

    public final void FJM(C270334gZ r7) {
        List<C22054Xuf> list = this.A08;
        for (C22054Xuf xuf : list) {
            if (!xuf.A0B) {
                return;
            }
        }
        this.A0A = true;
        C270334gZ r0 = this.A03;
        if (r0 != null) {
            r0.FJM(this);
        }
        if (this.A09) {
            this.A05.FJM(this);
            return;
        }
        C22054Xuf xuf2 = null;
        int i = 0;
        for (C22054Xuf xuf3 : list) {
            if (!(xuf3 instanceof XGS)) {
                i++;
                xuf2 = xuf3;
            }
        }
        if (xuf2 != null && i == 1 && xuf2.A0B) {
            XGS xgs = this.A04;
            if (xgs != null) {
                if (xgs.A0B) {
                    this.A00 = this.A01 * xgs.A02;
                } else {
                    return;
                }
            }
            A02(xuf2.A02 + this.A00);
        }
        C270334gZ r02 = this.A03;
        if (r02 != null) {
            r02.FJM(this);
        }
    }

    public C22054Xuf(C270324gY r4) {
        this.A05 = r4;
    }

    public static void A00(C22054Xuf xuf, Object obj, List list) {
        list.add(xuf);
        xuf.A08.add(obj);
    }

    public final String toString() {
        String str;
        Object obj;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.A05.A02.A0n);
        A1A.append(":");
        switch (this.A06.intValue()) {
            case 0:
                str = "UNKNOWN";
                break;
            case 1:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 2:
                str = "VERTICAL_DIMENSION";
                break;
            case 3:
                str = "LEFT";
                break;
            case 4:
                str = "RIGHT";
                break;
            case 5:
                str = "TOP";
                break;
            case 6:
                str = "BOTTOM";
                break;
            default:
                str = "BASELINE";
                break;
        }
        A1A.append(str);
        A1A.append("(");
        if (this.A0B) {
            obj = Integer.valueOf(this.A02);
        } else {
            obj = "unresolved";
        }
        A1A.append(obj);
        A1A.append(") <t=");
        A1A.append(this.A08.size());
        A1A.append(":d=");
        A1A.append(this.A07.size());
        return AnonymousClass7TF.A0l(">", A1A);
    }
}
