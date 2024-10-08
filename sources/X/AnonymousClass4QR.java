package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;

/* renamed from: X.4QR  reason: invalid class name */
public final class AnonymousClass4QR extends AnonymousClass4PK implements Handler.Callback {
    public long A00;
    public long A01;
    public Metadata A02;
    public AnonymousClass4TO A03;
    public List A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final AnonymousClass4QP A08;
    public final AnonymousClass4QS A09;
    public final AnonymousClass4QO A0A;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.4PQ, X.4QS] */
    public AnonymousClass4QR(Looper looper, AnonymousClass4QP r4, AnonymousClass4QO r5, String str) {
        super(5);
        Handler handler;
        this.A0A = r5;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.A07 = handler;
        r4.getClass();
        this.A08 = r4;
        this.A09 = new AnonymousClass4PQ(1);
        this.A00 = -9223372036854775807L;
        if (str != null && !str.isEmpty()) {
            try {
                this.A04 = V6P.A00(str);
            } catch (JSONException unused) {
                Log.e("MetadataRenderer", C273654mx.A00(1247));
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
                    AnonymousClass4QP r1 = this.A08;
                    if (r1.Ez7(CGo)) {
                        AnonymousClass4TN ALr = r1.ALr(CGo);
                        byte[] CGn = entryArr[i].CGn();
                        CGn.getClass();
                        AnonymousClass4QS r12 = this.A09;
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

    public final void A0K() {
        this.A02 = null;
        this.A03 = null;
        this.A00 = -9223372036854775807L;
    }

    public final void A0L(long j, boolean z) {
        this.A02 = null;
        this.A05 = false;
        this.A06 = false;
    }

    public final boolean CaO() {
        return true;
    }

    public final String getName() {
        return "MetadataRenderer";
    }

    public final void A0N(C256683wB[] r9, long j, long j2) {
        this.A03 = this.A08.ALr(r9[0]);
        Metadata metadata = this.A02;
        if (metadata != null) {
            long j3 = metadata.A00;
            long j4 = (j3 + this.A00) - j2;
            if (j3 != j4) {
                metadata = new Metadata(metadata.A01, j4);
            }
            this.A02 = metadata;
        }
        this.A00 = j2;
    }

    public final boolean CSi() {
        return this.A06;
    }

    public final void EEq(long j, long j2) {
        boolean z;
        List list = this.A04;
        if (list != null) {
            UUID uuid = AnonymousClass4T7.A04;
            long A082 = Util.A08(j);
            Handler handler = this.A07;
            if (handler != null) {
                handler.obtainMessage(1, Long.valueOf(A082)).sendToTarget();
            } else {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
            }
        }
        do {
            if (!this.A05 && this.A02 == null) {
                AnonymousClass4QS r2 = this.A09;
                r2.clear();
                AnonymousClass4PO r3 = this.A0C;
                r3.A01 = null;
                r3.A00 = null;
                int A0E = A0E(r3, r2, 0);
                if (A0E == -4) {
                    if ((r2.A00 & 4) == 4) {
                        this.A05 = true;
                    } else {
                        r2.A00 = this.A01;
                        r2.A00();
                        Metadata ANb = this.A03.ANb(r2);
                        if (ANb != null) {
                            ArrayList arrayList = new ArrayList(ANb.A01.length);
                            A00(ANb, arrayList);
                            if (!arrayList.isEmpty()) {
                                long j3 = r2.A01;
                                boolean z2 = true;
                                boolean z3 = false;
                                if (j3 != -9223372036854775807L) {
                                    z3 = true;
                                }
                                C256703wD.A04(z3);
                                long j4 = this.A00;
                                if (j4 == -9223372036854775807L) {
                                    z2 = false;
                                }
                                C256703wD.A04(z2);
                                this.A02 = new Metadata((Metadata.Entry[]) arrayList.toArray(new Metadata.Entry[0]), j3 - j4);
                            }
                        }
                    }
                } else if (A0E == -5) {
                    C256683wB r0 = r3.A00;
                    r0.getClass();
                    this.A01 = r0.A0M;
                }
            }
            Metadata metadata = this.A02;
            if (metadata != null) {
                long j5 = metadata.A00;
                boolean z4 = true;
                boolean z5 = false;
                if (j != -9223372036854775807L) {
                    z5 = true;
                }
                C256703wD.A04(z5);
                long j6 = this.A00;
                if (j6 == -9223372036854775807L) {
                    z4 = false;
                }
                C256703wD.A04(z4);
                if (j5 <= j - j6) {
                    UUID uuid2 = AnonymousClass4T7.A04;
                    long A083 = Util.A08(j - j5);
                    Handler handler2 = this.A07;
                    if (handler2 != null) {
                        handler2.obtainMessage(0, new Object[]{metadata, Long.valueOf(A083)}).sendToTarget();
                    } else {
                        this.A0A.DS5(metadata, A083);
                    }
                    metadata = null;
                    this.A02 = null;
                    z = true;
                    if (this.A05 && metadata == null) {
                        this.A06 = true;
                        continue;
                    }
                }
            }
            z = false;
            this.A06 = true;
            continue;
        } while (z);
    }

    public final int Ez5(C256683wB r4) {
        int i;
        if (this.A08.Ez7(r4)) {
            i = 2;
            if (r4.A07 == 0) {
                i = 4;
            }
        } else {
            i = 0;
        }
        return i | 0 | 128;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            Object[] objArr = (Object[]) message.obj;
            long longValue = ((Number) objArr[1]).longValue();
            this.A0A.DS5((Metadata) objArr[0], longValue);
        } else if (i == 1) {
            List list = this.A04;
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
