package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;

/* renamed from: X.5f5  reason: invalid class name and case insensitive filesystem */
public final class C290295f5 extends AnonymousClass4PK implements Handler.Callback {
    public int A00;
    public int A01;
    public List A02;
    public long A03;
    public AnonymousClass4TO A04;
    public boolean A05;
    public final Handler A06;
    public final AnonymousClass4QO A07;
    public final Metadata[] A08;
    public final AnonymousClass4QP A09;
    public final AnonymousClass4QS A0A;
    public final long[] A0B;

    /* JADX WARNING: type inference failed for: r0v2, types: [X.4PQ, X.4QS] */
    public C290295f5(Looper looper, AnonymousClass4QP r5, AnonymousClass4QO r6, String str) {
        super(5);
        Handler handler;
        this.A07 = r6;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.A06 = handler;
        r5.getClass();
        this.A09 = r5;
        this.A0A = new AnonymousClass4PQ(1);
        this.A08 = new Metadata[5];
        this.A0B = new long[5];
        if (str != null && !str.isEmpty()) {
            try {
                this.A02 = V6P.A00(str);
            } catch (JSONException unused) {
                2AG.A03("MetadataRenderer", "Error in parsing IMF spec");
            }
        }
    }

    private void A00(Metadata metadata, List list) {
        int i = 0;
        while (true) {
            Metadata.Entry[] entryArr = metadata.A01;
            if (i < entryArr.length) {
                C256683wB CGo = entryArr[i].CGo();
                if (CGo != null) {
                    AnonymousClass4QP r1 = this.A09;
                    if (r1.Ez7(CGo)) {
                        AnonymousClass4TN ALr = r1.ALr(CGo);
                        byte[] CGn = entryArr[i].CGn();
                        CGn.getClass();
                        AnonymousClass4QS r12 = this.A0A;
                        r12.clear();
                        r12.A01(CGn.length);
                        r12.A02.put(CGn);
                        r12.A00();
                        Metadata ANb = ALr.ANb(r12);
                        if (ANb != null) {
                            A00(ANb, list);
                        }
                        i++;
                    }
                }
                list.add(entryArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    public final boolean CaO() {
        return true;
    }

    public final String getName() {
        return "MetadataRenderer";
    }

    public final void A0K() {
        Arrays.fill(this.A08, (Object) null);
        this.A01 = 0;
        this.A00 = 0;
        this.A04 = null;
    }

    public final void A0L(long j, boolean z) {
        Arrays.fill(this.A08, (Object) null);
        this.A01 = 0;
        this.A00 = 0;
        this.A05 = false;
    }

    public final void A0N(C256683wB[] r3, long j, long j2) {
        this.A04 = this.A09.ALr(r3[0]);
    }

    public final boolean CSi() {
        return this.A05;
    }

    public final void EEq(long j, long j2) {
        List list = this.A02;
        if (list != null) {
            UUID uuid = AnonymousClass4T7.A03;
            long A082 = Util.A08(j);
            Handler handler = this.A06;
            if (handler != null) {
                handler.obtainMessage(1, Long.valueOf(A082)).sendToTarget();
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
        if (!this.A05 && this.A00 < 5) {
            AnonymousClass4QS r7 = this.A0A;
            r7.clear();
            AnonymousClass4PO r2 = this.A0C;
            r2.A01 = null;
            r2.A00 = null;
            int A0E = A0E(r2, r7, 0);
            if (A0E == -4) {
                int i = r7.A00;
                if ((i & 4) == 4) {
                    this.A05 = true;
                } else if ((i & AnonymousClass972.MUTABLE_FLAG_MASK) != Integer.MIN_VALUE) {
                    r7.A00 = this.A03;
                    r7.A00();
                    Metadata ANb = this.A04.ANb(r7);
                    if (ANb != null) {
                        ArrayList arrayList = new ArrayList(ANb.A01.length);
                        A00(ANb, arrayList);
                        if (!arrayList.isEmpty()) {
                            Metadata metadata = new Metadata((List) arrayList);
                            int i2 = this.A01;
                            int i3 = this.A00;
                            int i4 = (i2 + i3) % 5;
                            this.A08[i4] = metadata;
                            this.A0B[i4] = r7.A01;
                            this.A00 = i3 + 1;
                        }
                    }
                }
            } else if (A0E == -5) {
                C256683wB r0 = r2.A00;
                r0.getClass();
                this.A03 = r0.A0M;
            }
        }
        if (this.A00 > 0) {
            long[] jArr = this.A0B;
            int i5 = this.A01;
            long j3 = jArr[i5];
            if (j3 <= j) {
                Metadata[] metadataArr = this.A08;
                Metadata metadata2 = metadataArr[i5];
                UUID uuid2 = AnonymousClass4T7.A03;
                long A083 = Util.A08(j - j3);
                Handler handler2 = this.A06;
                if (handler2 != null) {
                    handler2.obtainMessage(0, new Object[]{metadata2, Long.valueOf(A083)}).sendToTarget();
                } else {
                    this.A07.DS5(metadata2, A083);
                }
                int i6 = this.A01;
                metadataArr[i6] = null;
                this.A01 = (i6 + 1) % 5;
                this.A00--;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r1 == 2) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int Ez5(X.C256683wB r4) {
        /*
            r3 = this;
            X.4QP r0 = r3.A09
            boolean r0 = r0.Ez7(r4)
            if (r0 == 0) goto L_0x0017
            int r1 = r4.A07
            if (r1 == 0) goto L_0x0010
            r0 = 2
            r2 = 2
            if (r1 != r0) goto L_0x0011
        L_0x0010:
            r2 = 4
        L_0x0011:
            r1 = 0
            r0 = 128(0x80, float:1.794E-43)
            r2 = r2 | r1
            r2 = r2 | r0
            return r2
        L_0x0017:
            r2 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C290295f5.Ez5(X.3wB):int");
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            Object[] objArr = (Object[]) message.obj;
            long longValue = ((Number) objArr[1]).longValue();
            this.A07.DS5((Metadata) objArr[0], longValue);
        } else if (i == 1) {
            List list = this.A02;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        } else {
            throw new IllegalStateException();
        }
        return true;
    }
}
