package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.NxA  reason: case insensitive filesystem */
public abstract class C70094NxA {
    public static final List A00(List list) {
        Object obj;
        Throwable A0z;
        OFJ ofj;
        OFJ ofj2 = null;
        OFJ ofj3 = null;
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            OTT ott = (OTT) it.next();
            boolean z = true;
            try {
                Object obj2 = ott.A01;
                if (obj2 != null) {
                    Object obj3 = ott.A03;
                    int intValue = ott.A00.intValue();
                    if (intValue != 0) {
                        if (intValue == 2) {
                            Object obj4 = ott.A02;
                            if (obj4 == null) {
                                A0z = AnonymousClass7TE.A0z("Required value was null.");
                            } else if (!A1E.containsKey(obj2)) {
                                ofj = new OFJ(obj2, obj3);
                                OFJ ofj4 = (OFJ) A1E.get(obj4);
                                if (ofj4 == null) {
                                    continue;
                                } else if (ofj4 == ofj2) {
                                    ofj.A00 = ofj2;
                                    ofj2.A01 = ofj;
                                    ofj2 = ofj;
                                } else {
                                    OFJ ofj5 = ofj4.A01;
                                    if (ofj5 != null) {
                                        ofj5.A00 = ofj;
                                        ofj4.A01 = ofj;
                                        ofj.A01 = ofj5;
                                        ofj.A00 = ofj4;
                                    } else {
                                        A0z = AnonymousClass7TE.A0z("Required value was null.");
                                    }
                                }
                            } else {
                                A0z = AnonymousClass7TE.A0z("duplicate key");
                            }
                        } else if (intValue == 3) {
                            Object obj5 = ott.A02;
                            if (obj5 == null) {
                                A0z = AnonymousClass7TE.A0z("Required value was null.");
                            } else if (!A1E.containsKey(obj2)) {
                                ofj = new OFJ(obj2, obj3);
                                OFJ ofj6 = (OFJ) A1E.get(obj5);
                                if (ofj6 != null) {
                                    if (ofj6 == ofj3) {
                                        ofj.A01 = ofj3;
                                        ofj3.A00 = ofj;
                                        ofj3 = ofj;
                                    } else {
                                        OFJ ofj7 = ofj6.A00;
                                        ofj6.A00 = ofj;
                                        ofj.A00 = ofj7;
                                        ofj.A01 = ofj6;
                                        if (ofj7 != null) {
                                            ofj7.A01 = ofj;
                                        }
                                    }
                                }
                            } else {
                                A0z = AnonymousClass7TE.A0z("duplicate key");
                            }
                        } else if (intValue != 1) {
                            A0z = AnonymousClass7TE.A1K();
                        } else if (!A1E.containsKey(obj2)) {
                            OFJ ofj8 = new OFJ(obj2, obj3);
                            if (A1E.isEmpty()) {
                                ofj2 = ofj8;
                                ofj3 = ofj8;
                            } else if (ofj2 != null) {
                                ofj2.A01 = ofj8;
                                ofj8.A00 = ofj2;
                                ofj2 = ofj8;
                            } else {
                                A0z = AnonymousClass7TE.A0z("Required value was null.");
                            }
                            A1E.put(ofj8.A02, ofj8);
                        } else {
                            A0z = AnonymousClass7TE.A0z("duplicate key");
                        }
                        A1E.put(obj2, ofj);
                    } else if (!A1E.containsKey(obj2)) {
                        OFJ ofj9 = new OFJ(obj2, obj3);
                        if (A1E.isEmpty()) {
                            ofj2 = ofj9;
                        } else if (ofj3 != null) {
                            ofj3.A00 = ofj9;
                            ofj9.A01 = ofj3;
                        } else {
                            A0z = AnonymousClass7TE.A0z("Required value was null.");
                        }
                        ofj3 = ofj9;
                        A1E.put(ofj9.A02, ofj9);
                    } else {
                        A0z = AnonymousClass7TE.A0z("duplicate key");
                    }
                } else {
                    A0z = AnonymousClass7TE.A0z("Required value was null.");
                }
                throw A0z;
            } catch (IllegalStateException e) {
                String message = e.getMessage();
                boolean z2 = false;
                if (message == null || !00l.A0d(message, "duplicate key", false)) {
                    z = false;
                }
                if (z) {
                    Object obj6 = ott.A01;
                    if (obj6 != null) {
                        OFJ ofj10 = (OFJ) A1E.get(obj6);
                        if (ofj10 != null) {
                            obj = ofj10.A03;
                        } else {
                            obj = null;
                        }
                        String A0m = AnonymousClass7TG.A0m(obj6, "duplicate key is ", AnonymousClass7TE.A1A());
                        String A0m2 = AnonymousClass7TG.A0m(obj, ". Inserted instruction type is ", AnonymousClass7TE.A1A());
                        StringBuilder A1A = AnonymousClass7TE.A1A();
                        A1A.append(", duplicate instruction type is ");
                        Object obj7 = ott.A03;
                        String A0i = AnonymousClass7TF.A0i(obj7, A1A);
                        if (obj != null) {
                            z2 = obj.equals(obj7);
                        }
                        String A0u = 002.A0u(A0m, A0m2, A0i, 002.A1D(", two instructions are equal ", z2));
                        0qQ.A07(A0u);
                        throw AnonymousClass7TE.A0z(A0u);
                    }
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        while (ofj2 != null) {
            A1C.add(ofj2.A03);
            ofj2 = ofj2.A00;
        }
        return 00k.A0a(A1C);
    }
}
