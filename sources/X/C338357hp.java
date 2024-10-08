package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7hp  reason: invalid class name and case insensitive filesystem */
public abstract class C338357hp implements C338367hq {
    public Map A00;

    public final B0X Aph() {
        return null;
    }

    public final String BNt() {
        return null;
    }

    public final void A8B(String str, Object obj) {
        Map map = this.A00;
        if (map == null) {
            map = Collections.synchronizedMap(new HashMap());
            this.A00 = map;
        }
        map.put(str, obj);
    }

    public final C251263mp Apd() {
        if (this instanceof C338347ho) {
            return ((C338347ho) this).A00;
        }
        throw new UnsupportedOperationException();
    }

    public final Object Auo(String str) {
        Map map = this.A00;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public final float Baa() {
        Map map = this.A00;
        if (map == null || !map.containsKey("parent_height_percent")) {
            return -1.0f;
        }
        return ((Number) this.A00.get("parent_height_percent")).floatValue();
    }

    public final float Bah() {
        Map map = this.A00;
        if (map == null || !map.containsKey("parent_width_percent")) {
            return -1.0f;
        }
        return ((Number) this.A00.get("parent_width_percent")).floatValue();
    }

    public final 2Sg Blf() {
        if (this instanceof C338347ho) {
            return ((C338347ho) this).A01;
        }
        throw new UnsupportedOperationException();
    }

    public final int By5() {
        Map map = this.A00;
        if (map == null || !map.containsKey("span_size")) {
            return 1;
        }
        return ((Number) this.A00.get("span_size")).intValue();
    }

    public final A7K CEe() {
        if (this instanceof C338377hr) {
            return ((C338377hr) this).A01;
        }
        throw new UnsupportedOperationException();
    }

    public final C338547i8 CEh() {
        if (this instanceof C338377hr) {
            return ((C338377hr) this).A02;
        }
        throw new UnsupportedOperationException();
    }

    public final int CEq() {
        if (this instanceof C338377hr) {
            return ((C338377hr) this).A00;
        }
        throw new UnsupportedOperationException();
    }

    public final boolean CJi() {
        if (this instanceof C338377hr) {
            return ((C338377hr) this).A03;
        }
        return false;
    }

    public final boolean CU5() {
        Map map = this.A00;
        if (map == null || !map.containsKey("is_full_span")) {
            return false;
        }
        return ((Boolean) this.A00.get("is_full_span")).booleanValue();
    }

    public final boolean Cca() {
        Map map = this.A00;
        if (map == null || !map.containsKey("is_sticky")) {
            return false;
        }
        return ((Boolean) this.A00.get("is_sticky")).booleanValue();
    }

    public final boolean EFF() {
        if (this instanceof C338347ho) {
            return true;
        }
        return false;
    }

    public final boolean EFI() {
        if (this instanceof C338377hr) {
            return true;
        }
        return false;
    }

    public final void EqZ(int i) {
        if (this instanceof C338377hr) {
            C338377hr r1 = (C338377hr) this;
            if (!r1.A03) {
                r1.A00 = i;
                return;
            }
            throw new UnsupportedOperationException("Cannot override custom view type.");
        }
        throw new UnsupportedOperationException();
    }
}
