package X;

/* renamed from: X.SuU  reason: case insensitive filesystem */
public final class C12438SuU implements C252523pF {
    public Object A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C12438SuU)) {
            return false;
        }
        Object obj2 = this.A00;
        Object obj3 = ((C12438SuU) obj).A00;
        if (obj2 != obj3) {
            return obj2 != null && obj2.equals(obj3);
        }
        return true;
    }

    public final void EN9(17Z r3, C269504fE r4) {
        Object obj = this.A00;
        if (obj instanceof C252523pF) {
            ((C252523pF) obj).EN9(r3, r4);
        } else if (obj instanceof 15z) {
            r3.A0j((15z) obj);
        } else {
            r3.A0M(String.valueOf(obj));
        }
    }

    public final void ENF(17Z r3, C269504fE r4, SPK spk) {
        Object obj = this.A00;
        if (obj instanceof C252523pF) {
            ((C252523pF) obj).ENF(r3, r4, spk);
        } else if (obj instanceof 15z) {
            EN9(r3, r4);
        }
    }

    public final int hashCode() {
        return AnonymousClass7TG.A0C(this.A00);
    }

    public final String toString() {
        return String.format("[RawValue of type %s]", new Object[]{C269574fL.A07(this.A00)});
    }
}
