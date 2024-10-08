package X;

import android.text.Html;
import android.text.Layout;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;

/* renamed from: X.5qX  reason: invalid class name and case insensitive filesystem */
public abstract class C296725qX extends AnonymousClass5Of implements C296735qY {
    public C296725qX() {
        super(new C296745qZ[2], new C296755qa[2]);
        int i = this.A00;
        C256703wD.A04(i == r2);
        for (AnonymousClass4PQ A01 : this.A0A) {
            A01.A01(1024);
        }
    }

    public final void EgB(long j) {
    }

    public final /* bridge */ /* synthetic */ AnonymousClass4PQ createInputBuffer() {
        return new AnonymousClass4PQ(1);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.4XV, java.lang.Object] */
    public C296765qb A05(byte[] bArr, int i, boolean z) {
        int i2;
        C296715qW r5 = (C296715qW) this;
        ArrayList arrayList = new ArrayList();
        C301755zw r3 = new C301755zw();
        ? obj = new Object();
        obj.A02 = bArr;
        obj.A00 = i;
        while (true) {
            Charset charset = AnonymousClass2RN.A05;
            String A0B = obj.A0B(charset);
            if (A0B == null) {
                break;
            } else if (A0B.length() != 0) {
                try {
                    Integer.parseInt(A0B);
                    String A0B2 = obj.A0B(charset);
                    if (A0B2 == null) {
                        27B.A02("HeroPlayer2SubripDecoder", Pxd.A00(596), new Object[0]);
                        break;
                    }
                    Matcher matcher = C296715qW.A01.matcher(A0B2);
                    if (matcher.matches()) {
                        boolean z2 = true;
                        r3.A01(C296715qW.A00(matcher, 1));
                        if (!TextUtils.isEmpty(matcher.group(6))) {
                            r3.A01(C296715qW.A00(matcher, 6));
                        } else {
                            z2 = false;
                        }
                        StringBuilder sb = r5.A00;
                        sb.setLength(0);
                        while (true) {
                            String A0B3 = obj.A0B(charset);
                            if (TextUtils.isEmpty(A0B3)) {
                                break;
                            }
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            sb.append(A0B3.trim());
                        }
                        String obj2 = sb.toString();
                        if (obj2 == null) {
                            obj2 = "";
                        }
                        arrayList.add(new C264814Rj((Layout.Alignment) null, Html.fromHtml(obj2), -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, AnonymousClass972.MUTABLE_FLAG_MASK, AnonymousClass972.MUTABLE_FLAG_MASK, AnonymousClass972.MUTABLE_FLAG_MASK, AnonymousClass972.MUTABLE_FLAG_MASK, -16777216, AnonymousClass972.MUTABLE_FLAG_MASK));
                        if (z2) {
                            arrayList.add((Object) null);
                        }
                    } else {
                        27B.A02("HeroPlayer2SubripDecoder", 002.A0R(Pxd.A00(568), A0B2), new Object[0]);
                    }
                } catch (NumberFormatException unused) {
                    27B.A02("HeroPlayer2SubripDecoder", 002.A0R(Pxd.A00(567), A0B), new Object[0]);
                }
            }
        }
        int size = arrayList.size();
        C264814Rj[] r6 = new C264814Rj[size];
        arrayList.toArray(r6);
        long[] copyOf = Arrays.copyOf(r3.A01, r3.A00);
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(new C301775zy(r6[i3], copyOf[i3]));
        }
        Collections.sort(arrayList2);
        for (i2 = 0; i2 < size; i2++) {
            C301775zy r1 = (C301775zy) arrayList2.get(i2);
            r6[i2] = r1.A01;
            copyOf[i2] = r1.A00;
        }
        return new C301785zz(copyOf, r6);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass5Oj createOutputBuffer() {
        return new C296775qc(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4Ay, java.lang.Exception] */
    public final /* bridge */ /* synthetic */ C261794Ay createUnexpectedDecodeException(Throwable th) {
        return new Exception("Unexpected decode error", th);
    }

    public final /* bridge */ /* synthetic */ C261794Ay decode(AnonymousClass4PQ r8, AnonymousClass5Oj r9, boolean z) {
        C296745qZ r82 = (C296745qZ) r8;
        C296755qa r92 = (C296755qa) r9;
        try {
            ByteBuffer byteBuffer = r82.A02;
            byteBuffer.getClass();
            C296765qb A05 = A05(byteBuffer.array(), byteBuffer.limit(), z);
            long j = r82.A01;
            long j2 = r82.A00;
            r92.A00 = j;
            r92.A01 = A05;
            if (j2 == Long.MAX_VALUE) {
                j2 = j;
            }
            r92.A00 = j2;
            r92.A00 = Integer.MAX_VALUE & r92.A00;
            return null;
        } catch (AnonymousClass4UK e) {
            return e;
        }
    }
}
