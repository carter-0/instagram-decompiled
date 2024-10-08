package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.text.Spanned;
import com.google.common.collect.ImmutableList;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.SeT  reason: case insensitive filesystem */
public final /* synthetic */ class C11670SeT implements C13507TbY {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C11718SfF A02;

    public /* synthetic */ C11670SeT(C11718SfF sfF, int i, long j) {
        this.A02 = sfF;
        this.A01 = j;
        this.A00 = i;
    }

    public final void accept(Object obj) {
        C11718SfF sfF = this.A02;
        long j = this.A01;
        int i = this.A00;
        C10513RtS rtS = (C10513RtS) obj;
        C11366SPh.A00(sfF.A00);
        ImmutableList immutableList = rtS.A02;
        long j2 = rtS.A00;
        ArrayList A0m = C51970G9q.A0m(immutableList);
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            C11270SIh sIh = (C11270SIh) it.next();
            Bundle A0a = AnonymousClass7TE.A0a();
            CharSequence charSequence = sIh.A0F;
            if (charSequence != null) {
                A0a.putCharSequence(C11270SIh.A0S, charSequence);
                if (charSequence instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequence;
                    String str = SD2.A00;
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    for (C11175SEb sEb : (C11175SEb[]) spanned.getSpans(0, spanned.length(), C11175SEb.class)) {
                        Bundle A0a2 = AnonymousClass7TE.A0a();
                        A0a2.putString(C11175SEb.A03, sEb.A01);
                        A0a2.putInt(C11175SEb.A02, sEb.A00);
                        A1C.add(SD2.A00(A0a2, spanned, sEb, 1));
                    }
                    for (C11198SEy sEy : (C11198SEy[]) spanned.getSpans(0, spanned.length(), C11198SEy.class)) {
                        Bundle A0a3 = AnonymousClass7TE.A0a();
                        A0a3.putInt(C11198SEy.A04, sEy.A01);
                        A0a3.putInt(C11198SEy.A03, sEy.A00);
                        A0a3.putInt(C11198SEy.A05, sEy.A02);
                        A1C.add(SD2.A00(A0a3, spanned, sEy, 2));
                    }
                    for (C9173RRy A002 : (C9173RRy[]) spanned.getSpans(0, spanned.length(), C9173RRy.class)) {
                        A1C.add(SD2.A00((Bundle) null, spanned, A002, 3));
                    }
                    if (!A1C.isEmpty()) {
                        A0a.putParcelableArrayList(C11270SIh.A0J, A1C);
                    }
                }
            }
            A0a.putSerializable(C11270SIh.A0T, sIh.A0E);
            A0a.putSerializable(C11270SIh.A0N, sIh.A0D);
            A0a.putFloat(C11270SIh.A0K, sIh.A01);
            A0a.putInt(C11270SIh.A0M, sIh.A07);
            A0a.putInt(C11270SIh.A0L, sIh.A06);
            A0a.putFloat(C11270SIh.A0O, sIh.A02);
            A0a.putInt(C11270SIh.A0P, sIh.A08);
            A0a.putInt(C11270SIh.A0V, sIh.A09);
            A0a.putFloat(C11270SIh.A0U, sIh.A05);
            A0a.putFloat(C11270SIh.A0R, sIh.A04);
            A0a.putFloat(C11270SIh.A0I, sIh.A00);
            A0a.putBoolean(C11270SIh.A0Y, false);
            A0a.putInt(C11270SIh.A0X, sIh.A0B);
            A0a.putInt(C11270SIh.A0W, sIh.A0A);
            A0a.putFloat(C11270SIh.A0Q, sIh.A03);
            Bitmap bitmap = sIh.A0C;
            if (bitmap != null) {
                ByteArrayOutputStream A0b = Pxe.A0b();
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                0fO.A01(compressFormat, bitmap, 0);
                C11366SPh.A02(bitmap.compress(compressFormat, 0, A0b));
                A0a.putByteArray(C11270SIh.A0H, A0b.toByteArray());
            }
            A0m.add(A0a);
        }
        Bundle A0a4 = AnonymousClass7TE.A0a();
        A0a4.putParcelableArrayList("c", A0m);
        A0a4.putLong("d", j2);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(A0a4);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        C11389SRd sRd = sfF.A05;
        int length = marshall.length;
        sRd.A0Q(marshall, length);
        C13900TjN tjN = sfF.A06;
        tjN.EJf(sRd, length);
        long j3 = rtS.A01;
        int i2 = (j3 > -9223372036854775807L ? 1 : (j3 == -9223372036854775807L ? 0 : -1));
        SJM sjm = sfF.A00;
        if (i2 == 0) {
            C11366SPh.A02(AnonymousClass7TF.A1Q((sjm.A0O > Long.MAX_VALUE ? 1 : (sjm.A0O == Long.MAX_VALUE ? 0 : -1))));
        } else {
            long j4 = sjm.A0O;
            if (j4 == Long.MAX_VALUE) {
                j += j3;
            } else {
                j = j3 + j4;
            }
        }
        tjN.EJm((S4h) null, i, length, 0, j);
    }
}
