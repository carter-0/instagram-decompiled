package X;

public abstract class SPK {
    /* JADX WARNING: type inference failed for: r2v0, types: [X.RyK, java.lang.Object] */
    public final C10798RyK A05(16L r4, Object obj) {
        Integer num;
        Integer num2;
        ? obj2 = new Object();
        obj2.A03 = obj;
        obj2.A04 = null;
        obj2.A00 = r4;
        int ordinal = A02().ordinal();
        if (ordinal == 4) {
            num = AnonymousClass05K.A0N;
        } else if (ordinal == 3) {
            num = AnonymousClass05K.A0Y;
        } else if (ordinal != 0) {
            if (ordinal == 2) {
                num2 = AnonymousClass05K.A00;
            } else if (ordinal != 1) {
                throw AnonymousClass7TE.A15("Internal error: this code path should never get executed");
            } else {
                num2 = AnonymousClass05K.A01;
            }
            obj2.A02 = num2;
            return obj2;
        } else {
            num = AnonymousClass05K.A0C;
        }
        obj2.A02 = num;
        obj2.A05 = A07();
        return obj2;
    }

    public static C10798RyK A01(17Z r1, SPK spk, Class cls, Object obj) {
        C10798RyK A05 = spk.A05(16L.A0J, obj);
        A05.A01 = cls;
        return spk.A03(r1, A05);
    }

    public final REQ A02() {
        if (this instanceof C8234Qkh) {
            return ((C8234Qkh) this).A00.A02();
        }
        if (this instanceof C8231Qke) {
            return REQ.WRAPPER_OBJECT;
        }
        if (this instanceof C8232Qkf) {
            return REQ.EXTERNAL_PROPERTY;
        }
        C8230Qkd qkd = (C8230Qkd) this;
        if (!(qkd instanceof C8235Qki)) {
            return REQ.WRAPPER_ARRAY;
        }
        if (((C8235Qki) qkd) instanceof C8226QkZ) {
            return REQ.EXISTING_PROPERTY;
        }
        return REQ.PROPERTY;
    }

    public final C10798RyK A03(17Z r7, C10798RyK ryK) {
        String valueOf;
        if (this instanceof C8234Qkh) {
            C8234Qkh qkh = (C8234Qkh) this;
            ryK.A03 = qkh.A01;
            return qkh.A00.A03(r7, ryK);
        }
        C8233Qkg qkg = (C8233Qkg) this;
        Object obj = ryK.A04;
        if (obj == null) {
            Object obj2 = ryK.A03;
            Class cls = ryK.A01;
            C13805ThU thU = qkg.A01;
            if (cls == null) {
                obj = thU.CLx(obj2);
            } else {
                obj = thU.CLy(cls, obj2);
            }
            ryK.A04 = obj;
        }
        16L r5 = ryK.A00;
        if (r7.A0V()) {
            ryK.A06 = false;
            r7.A0I(obj);
        } else {
            if (obj instanceof String) {
                valueOf = (String) obj;
            } else {
                valueOf = String.valueOf(obj);
            }
            ryK.A06 = true;
            Integer num = ryK.A02;
            if (r5 != 16L.A0D && (num == AnonymousClass05K.A0C || num == AnonymousClass05K.A0N)) {
                num = AnonymousClass05K.A00;
                ryK.A02 = num;
            }
            int intValue = num.intValue();
            if (!(intValue == 4 || intValue == 3)) {
                if (intValue == 2) {
                    r7.A0o(ryK.A03);
                    r7.A0R(ryK.A05, valueOf);
                    return ryK;
                } else if (intValue != 1) {
                    r7.A0b();
                    r7.A0t(valueOf);
                } else {
                    r7.A0c();
                    r7.A0q(valueOf);
                }
            }
        }
        if (r5 == 16L.A0D) {
            r7.A0o(ryK.A03);
        } else if (r5 == 16L.A0C) {
            r7.A0b();
            return ryK;
        }
        return ryK;
    }

    public final C10798RyK A04(17Z r3, C10798RyK ryK) {
        String valueOf;
        if (this instanceof C8234Qkh) {
            return ((C8234Qkh) this).A00.A04(r3, ryK);
        }
        16L r1 = ryK.A00;
        if (r1 == 16L.A0D) {
            r3.A0Z();
        } else if (r1 == 16L.A0C) {
            r3.A0Y();
        }
        if (ryK.A06) {
            int intValue = ryK.A02.intValue();
            if (intValue == 4) {
                Object obj = ryK.A04;
                if (obj instanceof String) {
                    valueOf = (String) obj;
                } else {
                    valueOf = String.valueOf(obj);
                }
                r3.A0R(ryK.A05, valueOf);
                return ryK;
            } else if (!(intValue == 3 || intValue == 2)) {
                if (intValue != 0) {
                    r3.A0Z();
                } else {
                    r3.A0Y();
                    return ryK;
                }
            }
        }
        return ryK;
    }

    public final SPK A06(C13901TjO tjO) {
        if (this instanceof C8234Qkh) {
            throw C66580MXl.A11();
        } else if (this instanceof C8231Qke) {
            C8233Qkg qkg = (C8233Qkg) this;
            if (qkg.A00 != tjO) {
                return new C8233Qkg(tjO, qkg.A01);
            }
            return qkg;
        } else if (this instanceof C8232Qkf) {
            C8232Qkf qkf = (C8232Qkf) this;
            if (qkf.A00 != tjO) {
                return new C8232Qkf(tjO, qkf.A01, qkf.A00);
            }
            return qkf;
        } else {
            C8230Qkd qkd = (C8230Qkd) this;
            if (qkd instanceof C8235Qki) {
                C8235Qki qki = (C8235Qki) qkd;
                boolean z = qki instanceof C8226QkZ;
                C13901TjO tjO2 = qki.A00;
                if (z) {
                    if (tjO2 != tjO) {
                        return new C8235Qki(tjO, qki.A01, qki.A00);
                    }
                    return qki;
                } else if (tjO2 != tjO) {
                    return new C8235Qki(tjO, qki.A01, qki.A00);
                } else {
                    return qki;
                }
            } else if (qkd.A00 != tjO) {
                return new C8233Qkg(tjO, qkd.A01);
            } else {
                return qkd;
            }
        }
    }

    public final String A07() {
        if (this instanceof C8234Qkh) {
            return ((C8234Qkh) this).A00.A07();
        }
        C8233Qkg qkg = (C8233Qkg) this;
        if (qkg instanceof C8235Qki) {
            return ((C8235Qki) qkg).A00;
        }
        if (qkg instanceof C8232Qkf) {
            return ((C8232Qkf) qkg).A00;
        }
        return null;
    }

    public static C10798RyK A00(17Z r1, 16L r2, SPK spk, Object obj) {
        return spk.A03(r1, spk.A05(r2, obj));
    }
}
