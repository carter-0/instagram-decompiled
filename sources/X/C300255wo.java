package X;

import com.facebook.instagram.msys.InstagramDasmConfigCreator;
import com.facebook.msys.util.Provider;

/* renamed from: X.5wo  reason: invalid class name and case insensitive filesystem */
public abstract class C300255wo implements Provider {
    public boolean A00;
    public Object A01;

    public final synchronized Object get() {
        if (!this.A00) {
            this.A01 = A00();
            this.A00 = true;
        }
        return this.A01;
    }

    public Object A00() {
        if (this instanceof C300245wn) {
            return ((C300245wn) this).A00;
        }
        if (this instanceof AnonymousClass697) {
            return new Object();
        }
        if (this instanceof AnonymousClass68B) {
            return ((AnonymousClass68B) this).A00.A1P.get();
        }
        if (this instanceof AnonymousClass690) {
            return InstagramDasmConfigCreator.getInstance();
        }
        if (this instanceof AnonymousClass68A) {
            return true;
        }
        if (this instanceof AnonymousClass69B) {
            return "62c196cc283670265c8243af7482f62f8856499ba6f7f01c5067e75d05225969";
        }
        if (this instanceof AnonymousClass699) {
            AnonymousClass2HN r2 = ((AnonymousClass699) this).A00;
            boolean z = true;
            if ((!r2.A02() || !((Boolean) r2.A01.get()).booleanValue()) && !((Boolean) r2.A0E.get()).booleanValue()) {
                z = false;
            }
            return Boolean.valueOf(z);
        } else if (this instanceof AnonymousClass691) {
            return ((AnonymousClass691) this).A00.toString();
        } else {
            if (this instanceof AnonymousClass687) {
                return Boolean.valueOf(182.A06(0Tu.A05, ((AnonymousClass687) this).A00, 36328615801601497L));
            } else if (this instanceof AnonymousClass69A) {
                return Integer.valueOf(((AnonymousClass69A) this).A00);
            } else {
                if (!(this instanceof AnonymousClass686)) {
                    return ((AnonymousClass694) this).A00.A0L.get();
                }
                return Boolean.valueOf(182.A06(0Tu.A05, ((AnonymousClass686) this).A00, 36320184780988509L));
            }
        }
    }
}
