package X;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;

/* renamed from: X.5TB  reason: invalid class name */
public final class AnonymousClass5TB implements AnonymousClass5TC {
    public final ClipboardManager A00;

    public AnonymousClass5TB(Context context) {
        Object systemService = context.getSystemService("clipboard");
        0qQ.A0C(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.A00 = (ClipboardManager) systemService;
    }

    public final void Eny(C286025Tq r25) {
        CharSequence charSequence;
        ClipboardManager clipboardManager = this.A00;
        C286025Tq r1 = r25;
        0sn r5 = r1.A03;
        if (r5 == null) {
            r5 = 0sn.A00;
        }
        if (r5.isEmpty()) {
            charSequence = r1.A00;
        } else {
            SpannableString spannableString = new SpannableString(r1.A00);
            Parcel obtain = Parcel.obtain();
            int size = r5.size();
            for (int i = 0; i < size; i++) {
                C3022062b r0 = (C3022062b) r5.get(i);
                AnonymousClass5ZB r6 = (AnonymousClass5ZB) r0.A02;
                int i2 = r0.A01;
                int i3 = r0.A00;
                obtain.recycle();
                obtain = Parcel.obtain();
                long Aoz = r6.A0C.Aoz();
                long j = AnonymousClass5RW.A08;
                if (Aoz != j) {
                    obtain.writeByte((byte) 1);
                    obtain.writeLong(r6.A0C.Aoz());
                }
                long j2 = r6.A01;
                long j3 = AnonymousClass5Z5.A01;
                if (j2 != j3) {
                    obtain.writeByte((byte) 2);
                    long j4 = r6.A01;
                    long A01 = AnonymousClass5Z5.A01(j4);
                    boolean z = false;
                    if (A01 == 0) {
                        z = true;
                    }
                    byte b = 0;
                    if (!z) {
                        if (A01 == 4294967296L) {
                            b = 1;
                        } else if (A01 == 8589934592L) {
                            b = 2;
                        }
                    }
                    obtain.writeByte(b);
                    if (AnonymousClass5Z5.A01(j4) != 0) {
                        obtain.writeFloat(AnonymousClass5Z5.A00(j4));
                    }
                }
                AnonymousClass5ZD r12 = r6.A08;
                if (r12 != null) {
                    obtain.writeByte((byte) 3);
                    obtain.writeInt(r12.A00);
                }
                C291715hl r02 = r6.A06;
                if (r02 != null) {
                    int i4 = r02.A00;
                    obtain.writeByte((byte) 4);
                    byte b2 = 0;
                    boolean z2 = false;
                    if (i4 == 0) {
                        z2 = true;
                    }
                    if (!z2 && i4 == 1) {
                        b2 = 1;
                    }
                    obtain.writeByte(b2);
                }
                C291725hm r03 = r6.A07;
                if (r03 != null) {
                    int i5 = r03.A00;
                    obtain.writeByte((byte) 5);
                    byte b3 = 0;
                    boolean z3 = false;
                    if (i5 == 0) {
                        z3 = true;
                    }
                    if (!z3) {
                        if (i5 == 1) {
                            b3 = 1;
                        } else if (i5 == 2) {
                            b3 = 2;
                        } else if (i5 == 3) {
                            b3 = 3;
                        }
                    }
                    obtain.writeByte(b3);
                }
                String str = r6.A0E;
                if (str != null) {
                    obtain.writeByte((byte) 6);
                    obtain.writeString(str);
                }
                if (r6.A02 != j3) {
                    obtain.writeByte((byte) 7);
                    long j5 = r6.A02;
                    long A012 = AnonymousClass5Z5.A01(j5);
                    boolean z4 = false;
                    if (A012 == 0) {
                        z4 = true;
                    }
                    byte b4 = 0;
                    if (!z4) {
                        if (A012 == 4294967296L) {
                            b4 = 1;
                        } else if (A012 == 8589934592L) {
                            b4 = 2;
                        }
                    }
                    obtain.writeByte(b4);
                    if (AnonymousClass5Z5.A01(j5) != 0) {
                        obtain.writeFloat(AnonymousClass5Z5.A00(j5));
                    }
                }
                C291735hn r04 = r6.A0A;
                if (r04 != null) {
                    float f = r04.A00;
                    obtain.writeByte((byte) 8);
                    obtain.writeFloat(f);
                }
                C291745ho r13 = r6.A0D;
                if (r13 != null) {
                    obtain.writeByte((byte) 9);
                    obtain.writeFloat(r13.A00);
                    obtain.writeFloat(r13.A01);
                }
                if (r6.A00 != j) {
                    obtain.writeByte((byte) 10);
                    obtain.writeLong(r6.A00);
                }
                C291795ht r14 = r6.A0B;
                if (r14 != null) {
                    obtain.writeByte((byte) 11);
                    obtain.writeInt(r14.A00);
                }
                C291805hu r122 = r6.A03;
                if (r122 != null) {
                    obtain.writeByte((byte) 12);
                    obtain.writeLong(r122.A01);
                    long j6 = r122.A02;
                    obtain.writeFloat(C289295dM.A01(j6));
                    obtain.writeFloat(C289295dM.A02(j6));
                    obtain.writeFloat(r122.A00);
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(obtain.marshall(), 0)), i2, i3, 33);
            }
            charSequence = spannableString;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("plain text", charSequence));
    }
}
