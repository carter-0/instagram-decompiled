package X;

import android.content.Context;
import com.instagram.common.gallery.Medium;
import java.util.Map;

/* renamed from: X.8XR  reason: invalid class name */
public final class AnonymousClass8XR {
    public final Context A00;

    /* JADX WARNING: type inference failed for: r2v1, types: [X.8gB, java.lang.Object] */
    public static final void A00(Medium medium, Map map) {
        0qQ.A0B(medium, 0);
        0qQ.A0B(map, 1);
        if (map.containsKey(String.valueOf(medium.A05))) {
            Object obj = map.get(String.valueOf(medium.A05));
            if (obj != null) {
                C358058aI r3 = (C358058aI) obj;
                medium.A0T = r3.A0K;
                medium.A0V = r3.A0M;
                medium.A0L = r3.A0I;
                medium.A0Z = r3.A0N;
                medium.A0R = r3.A0J;
                int i = medium.A03;
                medium.A0A = 0;
                medium.A09 = i;
                ? obj2 = new Object();
                Float f = r3.A08;
                if (f != null) {
                    obj2.A06 = f.floatValue();
                    Float f2 = r3.A0F;
                    if (f2 != null) {
                        obj2.A0A = f2.floatValue();
                        Float f3 = r3.A0A;
                        if (f3 != null) {
                            obj2.A08 = f3.floatValue();
                            Float f4 = r3.A0B;
                            if (f4 != null) {
                                obj2.A09 = f4.floatValue();
                                Float f5 = r3.A05;
                                if (f5 != null) {
                                    obj2.A04 = f5.floatValue();
                                    Float f6 = r3.A07;
                                    if (f6 != null) {
                                        obj2.A05 = f6.floatValue();
                                        if (r3.A06 != null) {
                                            Float f7 = r3.A01;
                                            if (f7 != null) {
                                                obj2.A00 = f7.floatValue();
                                                Float f8 = r3.A02;
                                                if (f8 != null) {
                                                    obj2.A01 = f8.floatValue();
                                                    if (r3.A0C == null) {
                                                        throw new IllegalStateException("Required value was null.");
                                                    } else if (r3.A0D == null) {
                                                        throw new IllegalStateException("Required value was null.");
                                                    } else if (r3.A0E != null) {
                                                        Float f9 = r3.A09;
                                                        if (f9 != null) {
                                                            obj2.A07 = f9.floatValue();
                                                            if (r3.A0G != null) {
                                                                Float f10 = r3.A04;
                                                                if (f10 != null) {
                                                                    obj2.A03 = f10.floatValue();
                                                                    Float f11 = r3.A03;
                                                                    if (f11 != null) {
                                                                        obj2.A02 = f11.floatValue();
                                                                        medium.A0F = obj2;
                                                                        return;
                                                                    }
                                                                    throw new IllegalStateException("Required value was null.");
                                                                }
                                                                throw new IllegalStateException("Required value was null.");
                                                            }
                                                            throw new IllegalStateException("Required value was null.");
                                                        }
                                                        throw new IllegalStateException("Required value was null.");
                                                    } else {
                                                        throw new IllegalStateException("Required value was null.");
                                                    }
                                                } else {
                                                    throw new IllegalStateException("Required value was null.");
                                                }
                                            } else {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                        } else {
                                            throw new IllegalStateException("Required value was null.");
                                        }
                                    } else {
                                        throw new IllegalStateException("Required value was null.");
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public AnonymousClass8XR(Context context) {
        this.A00 = context;
    }
}
