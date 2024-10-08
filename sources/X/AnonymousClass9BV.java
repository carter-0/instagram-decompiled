package X;

import com.google.crypto.tink.BinaryKeysetReader;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.9BV  reason: invalid class name */
public final class AnonymousClass9BV {
    public final C375219Cs A00;
    public final C3738097a A01;
    public final List A02;

    public static final AnonymousClass9BV A00(AnonymousClass98Q r5, BinaryKeysetReader binaryKeysetReader) {
        byte[] bArr = new byte[0];
        try {
            InputStream inputStream = binaryKeysetReader.A00;
            AnonymousClass972 A012 = AnonymousClass972.A01(new AnonymousClass9BY(inputStream), C3738397d.A00(), C3741098e.DEFAULT_INSTANCE);
            AnonymousClass972.A05(A012);
            C3741098e r0 = (C3741098e) A012;
            inputStream.close();
            if (r0 != null) {
                AnonymousClass97R r1 = r0.encryptedKeyset_;
                if (r1.A02() != 0) {
                    try {
                        C3738097a r02 = (C3738097a) AnonymousClass972.A02(C3738397d.A00(), C3738097a.DEFAULT_INSTANCE, r5.AOH(r1.A04(), bArr));
                        A02(r02);
                        return A01(r02);
                    } catch (AnonymousClass9GO unused) {
                        throw new GeneralSecurityException("invalid keyset, corrupted key material");
                    }
                }
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (Throwable th) {
            binaryKeysetReader.A00.close();
            throw th;
        }
    }

    public static void A02(C3738097a r1) {
        if (r1 == null || r1.key_.size() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final Object A03(Class cls) {
        Class cls2;
        Class cls3 = cls;
        try {
            Map map = ((AnonymousClass97A) AnonymousClass979.A01.A00.get()).A01;
            if (map.containsKey(cls3)) {
                cls2 = ((AnonymousClass97C) map.get(cls3)).BHT();
                if (cls2 != null) {
                    C3738097a r2 = this.A01;
                    int i = r2.primaryKeyId_;
                    int i2 = 0;
                    boolean z = false;
                    boolean z2 = true;
                    for (C3741398h r8 : r2.key_) {
                        C375139Ck A0F = r8.A0F();
                        if (A0F == C375139Ck.ENABLED) {
                            boolean z3 = true;
                            if ((r8.bitField0_ & 1) == 0) {
                                z3 = false;
                            }
                            if (z3) {
                                AnonymousClass98D A002 = AnonymousClass98D.A00(r8.outputPrefixType_);
                                if (A002 == null) {
                                    A002 = AnonymousClass98D.UNRECOGNIZED;
                                }
                                if (A002 == AnonymousClass98D.UNKNOWN_PREFIX) {
                                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(r8.keyId_)}));
                                } else if (A0F != C375139Ck.UNKNOWN_STATUS) {
                                    if (r8.keyId_ == i) {
                                        if (!z) {
                                            z = true;
                                        } else {
                                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                                        }
                                    }
                                    C3741498i r0 = r8.keyData_;
                                    if (r0 == null) {
                                        r0 = C3741498i.DEFAULT_INSTANCE;
                                    }
                                    if (r0.A0F() != AnonymousClass97O.ASYMMETRIC_PUBLIC) {
                                        z2 = false;
                                    }
                                    i2++;
                                } else {
                                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(r8.keyId_)}));
                                }
                            } else {
                                throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(r8.keyId_)}));
                            }
                        }
                    }
                    if (i2 == 0) {
                        throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
                    } else if (z || z2) {
                        C375369Dh r19 = null;
                        HashMap hashMap = new HashMap();
                        ArrayList arrayList = new ArrayList();
                        C375219Cs r9 = this.A00;
                        int i3 = 0;
                        while (true) {
                            List list = this.A02;
                            if (i3 < list.size()) {
                                C3741398h r6 = (C3741398h) r2.key_.get(i3);
                                C375139Ck A0F2 = r6.A0F();
                                C375139Ck r10 = C375139Ck.ENABLED;
                                if (A0F2.equals(r10)) {
                                    C375199Cq r82 = (C375199Cq) list.get(i3);
                                    if (r82 != null) {
                                        AnonymousClass97G r12 = r82.A00;
                                        try {
                                            Object A003 = AnonymousClass979.A01.A00(r12, cls2);
                                            if (r6.keyId_ == r2.primaryKeyId_) {
                                                if (A003 == null) {
                                                    throw new NullPointerException("`fullPrimitive` must not be null");
                                                } else if (r6.A0F() == r10) {
                                                    C3740497y A004 = C3740497y.A00(C375359Dg.A00(r6));
                                                    C375139Ck A0F3 = r6.A0F();
                                                    AnonymousClass98D A005 = AnonymousClass98D.A00(r6.outputPrefixType_);
                                                    if (A005 == null) {
                                                        A005 = AnonymousClass98D.UNRECOGNIZED;
                                                    }
                                                    int i4 = r6.keyId_;
                                                    C3741498i r62 = r6.keyData_;
                                                    if (r62 == null) {
                                                        r62 = C3741498i.DEFAULT_INSTANCE;
                                                    }
                                                    C375369Dh r11 = new C375369Dh(r12, A0F3, A005, A004, A003, r62.typeUrl_, i4);
                                                    C375379Di.A00(r11, arrayList, hashMap);
                                                    if (r19 == null) {
                                                        r19 = r11;
                                                    } else {
                                                        throw new IllegalStateException("you cannot set two primary primitives");
                                                    }
                                                } else {
                                                    throw new GeneralSecurityException("only ENABLED key is allowed");
                                                }
                                            } else if (A003 == null) {
                                                throw new NullPointerException("`fullPrimitive` must not be null");
                                            } else if (r6.A0F() == r10) {
                                                C3740497y A006 = C3740497y.A00(C375359Dg.A00(r6));
                                                C375139Ck A0F4 = r6.A0F();
                                                AnonymousClass98D A007 = AnonymousClass98D.A00(r6.outputPrefixType_);
                                                if (A007 == null) {
                                                    A007 = AnonymousClass98D.UNRECOGNIZED;
                                                }
                                                int i5 = r6.keyId_;
                                                C3741498i r63 = r6.keyData_;
                                                if (r63 == null) {
                                                    r63 = C3741498i.DEFAULT_INSTANCE;
                                                }
                                                C375379Di.A00(new C375369Dh(r12, A0F4, A007, A006, A003, r63.typeUrl_, i5), arrayList, hashMap);
                                            } else {
                                                throw new GeneralSecurityException("only ENABLED key is allowed");
                                            }
                                        } catch (GeneralSecurityException e) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("Unable to get primitive ");
                                            sb.append(cls2);
                                            sb.append(" for key of type ");
                                            C3741498i r02 = r6.keyData_;
                                            if (r02 == null) {
                                                r02 = C3741498i.DEFAULT_INSTANCE;
                                            }
                                            sb.append(r02.typeUrl_);
                                            sb.append(", see https://developers.google.com/tink/faq/registration_errors");
                                            throw new GeneralSecurityException(sb.toString(), e);
                                        }
                                    } else {
                                        C3741498i r1 = r6.keyData_;
                                        if (r1 == null) {
                                            r1 = C3741498i.DEFAULT_INSTANCE;
                                        }
                                        throw new GeneralSecurityException(002.A08(i3, "Key parsing of key with index ", " and type_url ", r1.typeUrl_, " failed, unable to get primitive"));
                                    }
                                }
                                i3++;
                            } else {
                                C375379Di r18 = new C375379Di(r19, r9, cls2, arrayList, hashMap);
                                Map map2 = ((AnonymousClass97A) AnonymousClass979.A01.A00.get()).A01;
                                if (map2.containsKey(cls3)) {
                                    AnonymousClass97C r3 = (AnonymousClass97C) map2.get(cls3);
                                    Class cls4 = r18.A02;
                                    Class BHT = r3.BHT();
                                    if (cls4.equals(BHT) && BHT.equals(cls4)) {
                                        return r3.FNa(r18);
                                    }
                                    throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("No wrapper found for ");
                                sb2.append(cls3);
                                throw new GeneralSecurityException(sb2.toString());
                            }
                        }
                    } else {
                        throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
                    }
                } else {
                    throw new GeneralSecurityException(002.A0R("No wrapper found for ", cls3.getName()));
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("No input primitive class for ");
                sb3.append(cls3);
                sb3.append(" available");
                throw new GeneralSecurityException(sb3.toString());
            }
        } catch (GeneralSecurityException unused) {
            cls2 = null;
        }
    }

    public final String toString() {
        return C39842ABo.A00(this.A01).toString();
    }

    public AnonymousClass9BV(C3738097a r2, List list) {
        this.A01 = r2;
        this.A02 = list;
        this.A00 = C375219Cs.A01;
    }

    public static final AnonymousClass9BV A01(C3738097a r10) {
        Integer num;
        Throwable th;
        AnonymousClass97G A002;
        C375189Cp r1;
        A02(r10);
        ArrayList arrayList = new ArrayList(r10.key_.size());
        for (C3741398h r8 : r10.key_) {
            int i = r8.keyId_;
            try {
                AnonymousClass98D A003 = AnonymousClass98D.A00(r8.outputPrefixType_);
                if (A003 == null) {
                    A003 = AnonymousClass98D.UNRECOGNIZED;
                }
                if (A003 == AnonymousClass98D.RAW) {
                    num = null;
                } else {
                    num = Integer.valueOf(i);
                }
                try {
                    C3741498i r0 = r8.keyData_;
                    C3741498i r4 = r0;
                    if (r0 == null) {
                        r0 = C3741498i.DEFAULT_INSTANCE;
                    }
                    String str = r0.typeUrl_;
                    C3741498i r02 = r4;
                    if (r4 == null) {
                        r02 = C3741498i.DEFAULT_INSTANCE;
                    }
                    AnonymousClass97R r12 = r02.value_;
                    if (r4 == null) {
                        r4 = C3741498i.DEFAULT_INSTANCE;
                    }
                    C3739997t A004 = C3739997t.A00(r4.A0F(), A003, r12, num, str);
                    C3739497o r6 = C3739497o.A01;
                    C375049Ca r5 = C375049Ca.A00;
                    if (!((C3739597p) r6.A00.get()).A00.containsKey(new AnonymousClass98F(A004.A03, A004.getClass()))) {
                        A002 = new AnonymousClass97F(r5, A004);
                    } else {
                        A002 = r6.A00(r5, A004);
                    }
                    int ordinal = r8.A0F().ordinal();
                    if (ordinal == 1) {
                        r1 = C375189Cp.A03;
                    } else if (ordinal == 2) {
                        r1 = C375189Cp.A02;
                    } else if (ordinal == 3) {
                        r1 = C375189Cp.A01;
                    } else {
                        th = new GeneralSecurityException("Unknown key status");
                        throw th;
                    }
                    arrayList.add(new C375199Cq(A002, r1));
                } catch (GeneralSecurityException e) {
                    th = new RuntimeException("Creating a protokey serialization failed", e);
                }
            } catch (GeneralSecurityException unused) {
                arrayList.add((Object) null);
            }
        }
        return new AnonymousClass9BV(r10, Collections.unmodifiableList(arrayList));
    }

    public AnonymousClass9BV(C375219Cs r1, C3738097a r2, List list) {
        this.A01 = r2;
        this.A02 = list;
        this.A00 = r1;
    }
}
