package X;

import android.content.Context;
import android.graphics.Color;
import android.util.SparseArray;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: X.QYe  reason: case insensitive filesystem */
public final class C7819QYe extends SIU {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public ReadableMap A04;
    public boolean A05;
    public final QZK A06;
    public final C11404SSb A07;

    public final void A06(ReadableMap readableMap) {
        if (readableMap != null) {
            this.A03 = readableMap.getInt("r");
            this.A02 = readableMap.getInt("g");
            this.A01 = readableMap.getInt("b");
            this.A00 = readableMap.getInt("a");
            this.A04 = readableMap.getMap("nativeColor");
            this.A05 = false;
            A00();
            return;
        }
        this.A03 = 0;
        this.A02 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A04 = null;
        this.A05 = false;
    }

    private final void A00() {
        if (this.A04 != null && !this.A05) {
            Context A002 = this.A06.A00();
            if (A002 != null || (A002 = S98.A00(this)) != null) {
                Integer A003 = SPt.A00(A002, this.A04);
                C11404SSb sSb = this.A07;
                int i = this.A03;
                SparseArray sparseArray = sSb.A05;
                QYz qYz = (QYz) ((SIU) sparseArray.get(i));
                QYz qYz2 = (QYz) ((SIU) sparseArray.get(this.A02));
                QYz qYz3 = (QYz) ((SIU) sparseArray.get(this.A01));
                QYz qYz4 = (QYz) ((SIU) sparseArray.get(this.A00));
                if (qYz != null) {
                    qYz.A00 = (double) Color.red(JTP.A09(A003));
                }
                if (qYz2 != null) {
                    qYz2.A00 = (double) Color.green(JTP.A09(A003));
                }
                if (qYz3 != null) {
                    qYz3.A00 = (double) Color.blue(JTP.A09(A003));
                }
                if (qYz4 != null) {
                    qYz4.A00 = ((double) Color.alpha(JTP.A09(A003))) / 255.0d;
                }
                this.A05 = true;
            }
        }
    }

    public C7819QYe(C11404SSb sSb, QZK qzk, ReadableMap readableMap) {
        this.A07 = sSb;
        this.A06 = qzk;
        A06(readableMap);
    }

    public final String A03() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        SIU.A02(this, "ColorAnimatedNode[", A1A);
        A1A.append("]: r: ");
        A1A.append(this.A03);
        A1A.append("  g: ");
        A1A.append(this.A02);
        A1A.append(" b: ");
        A1A.append(this.A01);
        A1A.append(" a: ");
        return Pxe.A0z(A1A, this.A00);
    }

    public final int A05() {
        double d;
        double d2;
        double d3;
        A00();
        C11404SSb sSb = this.A07;
        int i = this.A03;
        SparseArray sparseArray = sSb.A05;
        QYz qYz = (QYz) ((SIU) sparseArray.get(i));
        QYz qYz2 = (QYz) ((SIU) sparseArray.get(this.A02));
        QYz qYz3 = (QYz) ((SIU) sparseArray.get(this.A01));
        QYz qYz4 = (QYz) ((SIU) sparseArray.get(this.A00));
        double d4 = 0.0d;
        if (qYz != null) {
            d = qYz.A00;
        } else {
            d = 0.0d;
        }
        if (qYz2 != null) {
            d2 = qYz2.A00;
        } else {
            d2 = 0.0d;
        }
        if (qYz3 != null) {
            d3 = qYz3.A00;
        } else {
            d3 = 0.0d;
        }
        if (qYz4 != null) {
            d4 = qYz4.A00;
        }
        return (Pxf.A01(255, AnonymousClass1GB.A00(d), 0) << 16) | (Math.max(0, Math.min(255, AnonymousClass1GB.A00(d4 * 255.0d))) << 24) | (Pxf.A01(255, AnonymousClass1GB.A00(d2), 0) << 8) | Pxf.A01(255, AnonymousClass1GB.A00(d3), 0);
    }
}
