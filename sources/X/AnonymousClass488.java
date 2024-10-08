package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.488  reason: invalid class name */
public abstract class AnonymousClass488 implements AnonymousClass484, Encoder {
    public final void A00(SerialDescriptor serialDescriptor, int i) {
        AnonymousClass486 r1;
        AnonymousClass487 r2 = (AnonymousClass487) this;
        int ordinal = r2.A06.ordinal();
        if (ordinal != 1) {
            boolean z = false;
            if (ordinal == 2) {
                r1 = r2.A05;
                if (!r1.A00) {
                    if (i % 2 == 0) {
                        r1.A01(',');
                        r1.A00();
                        z = true;
                    } else {
                        r1.A01(':');
                        if (r1 instanceof AnonymousClass489) {
                            r1.A01(' ');
                        }
                    }
                    r2.A02 = z;
                    return;
                }
                r2.A02 = true;
            } else if (ordinal != 3) {
                AnonymousClass486 r3 = r2.A05;
                if (!r3.A00) {
                    r3.A01(',');
                }
                r3.A00();
                0qQ.A0B(r2.A03, 1);
                0qQ.A0K(serialDescriptor.BKK(), C2590840i.A00);
                r2.ASB(serialDescriptor.B0V(i));
                r3.A01(':');
                if (r3 instanceof AnonymousClass489) {
                    r3.A01(' ');
                    return;
                }
                return;
            } else if (i == 0) {
                r2.A02 = true;
                return;
            } else if (i == 1) {
                AnonymousClass486 r12 = r2.A05;
                r12.A01(',');
                if (r12 instanceof AnonymousClass489) {
                    r12.A01(' ');
                }
                r2.A02 = false;
                return;
            } else {
                return;
            }
        } else {
            r1 = r2.A05;
            if (!r1.A00) {
                r1.A01(',');
            }
        }
        r1.A00();
    }

    public final void ARs(boolean z) {
        AnonymousClass487 r1 = (AnonymousClass487) this;
        if (r1.A02) {
            r1.ASB(String.valueOf(z));
        } else {
            r1.A05.A01.FNf(String.valueOf(z));
        }
    }

    public final void ARt(SerialDescriptor serialDescriptor, int i, boolean z) {
        0qQ.A0B(serialDescriptor, 0);
        A00(serialDescriptor, i);
        ARs(z);
    }

    public final void ARu(byte b) {
        AnonymousClass487 r1 = (AnonymousClass487) this;
        if (r1.A02) {
            r1.ASB(String.valueOf(b));
            return;
        }
        AnonymousClass486 r2 = r1.A05;
        if (r2 instanceof AnonymousClass48C) {
            AnonymousClass48C r22 = (AnonymousClass48C) r2;
            boolean z = r22.A00;
            String valueOf = String.valueOf(b & 255);
            if (z) {
                r22.A02(valueOf);
            } else {
                r22.A03(valueOf);
            }
        } else {
            ((AnonymousClass480) r2.A01).FNf(String.valueOf((long) b));
        }
    }

    public final void ARw(double d) {
        AnonymousClass487 r2 = (AnonymousClass487) this;
        if (r2.A02) {
            r2.ASB(String.valueOf(d));
        } else {
            r2.A05.A01.FNf(String.valueOf(d));
        }
        if (r2.A04.A04) {
            return;
        }
        if (Double.isInfinite(d) || Double.isNaN(d)) {
            throw C18804W2u.A03(Double.valueOf(d), r2.A05.A01.toString());
        }
    }

    public final void ARx(SerialDescriptor serialDescriptor, double d, int i) {
        0qQ.A0B(serialDescriptor, 0);
        A00(serialDescriptor, i);
        ARw(d);
    }

    public final void ARy(float f) {
        AnonymousClass487 r2 = (AnonymousClass487) this;
        if (r2.A02) {
            r2.ASB(String.valueOf(f));
        } else {
            r2.A05.A01.FNf(String.valueOf(f));
        }
        if (r2.A04.A04) {
            return;
        }
        if (Float.isInfinite(f) || Float.isNaN(f)) {
            throw C18804W2u.A03(Float.valueOf(f), r2.A05.A01.toString());
        }
    }

    public final void ARz(SerialDescriptor serialDescriptor, float f, int i) {
        0qQ.A0B(serialDescriptor, 0);
        A00(serialDescriptor, i);
        ARy(f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r1 == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final kotlinx.serialization.encoding.Encoder AS0(kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            r5 = this;
            r3 = r5
            X.487 r3 = (X.AnonymousClass487) r3
            r0 = 0
            X.0qQ.A0B(r6, r0)
            java.util.Set r0 = X.C39611A2b.A00
            boolean r2 = r6.isInline()
            if (r2 == 0) goto L_0x0016
            boolean r1 = r0.contains(r6)
            r0 = 1
            if (r1 != 0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r4 = 0
            if (r0 == 0) goto L_0x0033
            X.486 r2 = r3.A05
            boolean r0 = r2 instanceof X.AnonymousClass48C
            if (r0 != 0) goto L_0x0029
            X.481 r1 = r2.A01
            boolean r0 = r3.A02
            X.48C r2 = new X.48C
            r2.<init>(r1, r0)
        L_0x0029:
            X.3mB r1 = r3.A03
            X.40Y r0 = r3.A06
            X.487 r3 = new X.487
            r3.<init>(r1, r2, r0, r4)
        L_0x0032:
            return r3
        L_0x0033:
            if (r2 == 0) goto L_0x004d
            kotlinx.serialization.descriptors.SerialDescriptor r0 = X.C271114hv.A00
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x004d
            X.486 r2 = r3.A05
            boolean r0 = r2 instanceof X.Y7A
            if (r0 != 0) goto L_0x0029
            X.481 r1 = r2.A01
            boolean r0 = r3.A02
            X.Y7A r2 = new X.Y7A
            r2.<init>(r1, r0)
            goto L_0x0029
        L_0x004d:
            java.lang.String r0 = r3.A00
            if (r0 == 0) goto L_0x0032
            java.lang.String r0 = r6.BsV()
            r3.A01 = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass488.AS0(kotlinx.serialization.descriptors.SerialDescriptor):kotlinx.serialization.encoding.Encoder");
    }

    public final Encoder AS1(SerialDescriptor serialDescriptor, int i) {
        0qQ.A0B(serialDescriptor, 0);
        A00(serialDescriptor, i);
        return AS0(serialDescriptor.B0R(i));
    }

    public final void AS2(int i) {
        AnonymousClass487 r1 = (AnonymousClass487) this;
        if (r1.A02) {
            r1.ASB(String.valueOf(i));
            return;
        }
        AnonymousClass486 r6 = r1.A05;
        if (r6 instanceof AnonymousClass48C) {
            AnonymousClass48C r62 = (AnonymousClass48C) r6;
            boolean z = r62.A00;
            String l = Long.toString(((long) i) & 4294967295L, 10);
            if (z) {
                r62.A02(l);
            } else {
                r62.A03(l);
            }
        } else {
            ((AnonymousClass480) r6.A01).FNf(String.valueOf((long) i));
        }
    }

    public final void AS3(SerialDescriptor serialDescriptor, int i, int i2) {
        0qQ.A0B(serialDescriptor, 0);
        A00(serialDescriptor, i);
        AS2(i2);
    }

    public final void AS4(long j) {
        String str;
        String str2;
        AnonymousClass487 r1 = (AnonymousClass487) this;
        if (r1.A02) {
            r1.ASB(String.valueOf(j));
            return;
        }
        AnonymousClass486 r5 = r1.A05;
        if (r5 instanceof AnonymousClass48C) {
            AnonymousClass48C r52 = (AnonymousClass48C) r5;
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (r52.A00) {
                if (i == 0) {
                    str2 = "0";
                } else if (j > 0) {
                    str2 = Long.toString(j, 10);
                } else {
                    char[] cArr = new char[64];
                    long j2 = (j >>> 1) / 5;
                    int i2 = 63;
                    cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
                    while (j2 > 0) {
                        i2--;
                        cArr[i2] = Character.forDigit((int) (j2 % 10), 10);
                        j2 /= 10;
                    }
                    str2 = new String(cArr, i2, 64 - i2);
                }
                r52.A02(str2);
                return;
            }
            if (i == 0) {
                str = "0";
            } else if (j > 0) {
                str = Long.toString(j, 10);
            } else {
                char[] cArr2 = new char[64];
                long j3 = (j >>> 1) / 5;
                int i3 = 63;
                cArr2[63] = Character.forDigit((int) (j - (j3 * 10)), 10);
                while (j3 > 0) {
                    i3--;
                    cArr2[i3] = Character.forDigit((int) (j3 % 10), 10);
                    j3 /= 10;
                }
                str = new String(cArr2, i3, 64 - i3);
            }
            r52.A03(str);
            return;
        }
        ((AnonymousClass480) r5.A01).FNf(String.valueOf(j));
    }

    public final void AS5(SerialDescriptor serialDescriptor, int i, long j) {
        0qQ.A0B(serialDescriptor, 0);
        A00(serialDescriptor, i);
        AS4(j);
    }

    public void AS7(Object obj, C255473uB r3, SerialDescriptor serialDescriptor, int i) {
        0qQ.A0B(serialDescriptor, 0);
        0qQ.A0B(r3, 2);
        A00(serialDescriptor, i);
        if (r3.getDescriptor().CYM() || obj != null) {
            AS9(obj, r3);
        } else {
            AS6();
        }
    }

    public final void AS8(Object obj, C255473uB r3, SerialDescriptor serialDescriptor, int i) {
        0qQ.A0B(serialDescriptor, 0);
        0qQ.A0B(r3, 2);
        A00(serialDescriptor, i);
        AS9(obj, r3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        if (X.0qQ.A0K(r1, X.C360548el.A00) == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        if (r3 == false) goto L_0x00cb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AS9(java.lang.Object r9, X.C255473uB r10) {
        /*
            r8 = this;
            r2 = r8
            X.487 r2 = (X.AnonymousClass487) r2
            r5 = 0
            X.0qQ.A0B(r10, r5)
            X.3mB r4 = r2.A03
            X.40P r1 = r4.A00
            boolean r0 = r1.A0F
            if (r0 != 0) goto L_0x00d9
            boolean r3 = r10 instanceof X.C2590540f
            java.lang.Integer r1 = r1.A00
            if (r3 == 0) goto L_0x005e
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0082
            r6 = 0
        L_0x001a:
            r3 = r10
            X.40f r3 = (X.C2590540f) r3
            if (r9 == 0) goto L_0x008d
            X.3uB r3 = X.C18282Vp2.A01(r9, r2, r3)
            if (r6 == 0) goto L_0x00b3
            boolean r0 = r10 instanceof X.C20803WzG
            if (r0 == 0) goto L_0x00b3
            kotlinx.serialization.descriptors.SerialDescriptor r1 = r3.getDescriptor()
            X.0qQ.A0B(r1, r5)
            java.util.Set r0 = X.C360608er.A00(r1)
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x00b3
            X.WzG r10 = (X.C20803WzG) r10
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r10.getDescriptor()
            java.lang.String r4 = r0.BsV()
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r3.getDescriptor()
            java.lang.String r2 = r0.BsV()
            java.lang.String r1 = "Sealed class '"
            java.lang.String r3 = "' cannot be serialized as base class '"
            java.lang.String r5 = "' because it has property name that conflicts with JSON class discriminator '"
            java.lang.String r7 = "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism"
            java.lang.String r1 = X.002.A15(r1, r2, r3, r4, r5, r6, r7)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x005e:
            int r1 = r1.intValue()
            if (r1 == r5) goto L_0x00d9
            r0 = 2
            if (r1 == r0) goto L_0x00d9
            r0 = 1
            if (r1 != r0) goto L_0x00ad
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r10.getDescriptor()
            X.3uF r1 = r0.BKK()
            X.40i r0 = X.C2590840i.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0082
            X.8el r0 = X.C360548el.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00d9
        L_0x0082:
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r10.getDescriptor()
            java.lang.String r6 = X.VJ9.A00(r0, r4)
            if (r3 == 0) goto L_0x00cb
            goto L_0x001a
        L_0x008d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Value for serializer "
            r1.append(r0)
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r3.getDescriptor()
            r1.append(r0)
            java.lang.String r0 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x00ad:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x00b3:
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r3.getDescriptor()
            X.3uF r1 = r0.BKK()
            X.0qQ.A0B(r1, r5)
            boolean r0 = r1 instanceof X.AnonymousClass48A
            if (r0 != 0) goto L_0x00ed
            boolean r0 = r1 instanceof X.C255503uE
            if (r0 != 0) goto L_0x00e5
            boolean r0 = r1 instanceof X.C2591040k
            if (r0 != 0) goto L_0x00dd
            r10 = r3
        L_0x00cb:
            if (r6 == 0) goto L_0x00d9
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r10.getDescriptor()
            java.lang.String r0 = r0.BsV()
            r2.A00 = r6
            r2.A01 = r0
        L_0x00d9:
            r10.serialize(r2, r9)
            return
        L_0x00dd:
            java.lang.String r1 = "Actual serializer for polymorphic cannot be polymorphic itself"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00e5:
            java.lang.String r1 = "Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00ed:
            java.lang.String r1 = "Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass488.AS9(java.lang.Object, X.3uB):void");
    }

    public final void ASA(short s) {
        AnonymousClass487 r1 = (AnonymousClass487) this;
        if (r1.A02) {
            r1.ASB(String.valueOf(s));
            return;
        }
        AnonymousClass486 r2 = r1.A05;
        if (r2 instanceof AnonymousClass48C) {
            AnonymousClass48C r22 = (AnonymousClass48C) r2;
            boolean z = r22.A00;
            String valueOf = String.valueOf(s & 65535);
            if (z) {
                r22.A02(valueOf);
            } else {
                r22.A03(valueOf);
            }
        } else {
            ((AnonymousClass480) r2.A01).FNf(String.valueOf((long) s));
        }
    }

    public final void ASB(String str) {
        0qQ.A0B(str, 0);
        ((AnonymousClass487) this).A05.A02(str);
    }

    public final void ASC(String str, SerialDescriptor serialDescriptor, int i) {
        0qQ.A0B(serialDescriptor, 0);
        0qQ.A0B(str, 2);
        A00(serialDescriptor, i);
        ASB(str);
    }

    public final void ARv(char c) {
        ASB(String.valueOf(c));
    }
}
