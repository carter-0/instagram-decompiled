package X;

import android.view.View;
import com.facebook.litho.ComponentHost;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2zO  reason: invalid class name and case insensitive filesystem */
public final class C235172zO {
    public final C231502rm A00;
    public final C235182zP A01;
    public final AnonymousClass57S A02;
    public final 0sK A03;

    public C235172zO(UserSession userSession, Set set, 0sK r6) {
        AnonymousClass57S r0;
        this.A03 = r6;
        C231502rm A002 = C231492rl.A00(userSession);
        this.A00 = A002;
        this.A01 = new C235182zP(A002.A00);
        if (!set.isEmpty()) {
            r0 = new AnonymousClass57S(set, C41734AzP.A00, new C59341JFt(userSession, 17));
        } else {
            r0 = null;
        }
        this.A02 = r0;
    }

    public final void A00(View view, AnonymousClass30Y r12, C252093oY r13) {
        Object A0P;
        String A002;
        Integer CEk = r13.CEk(r12);
        0qQ.A07(CEk);
        Object obj = r12.A03;
        1Xj r4 = (1Xj) obj;
        String id = r4.getId();
        if (id == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (CEk == AnonymousClass05K.A0C) {
            AnonymousClass57S r8 = this.A02;
            if (r8 != null) {
                LinkedHashMap A022 = C244083ac.A02(id);
                HashMap hashMap = r8.A01;
                if (hashMap.containsKey(r4.getId())) {
                    Set<C244053aZ> set = r8.A02;
                    ArrayList arrayList = new ArrayList(0Yv.A1E(set, 10));
                    for (C244053aZ r0 : set) {
                        arrayList.add(r0.A00);
                    }
                    int A0L = 0se.A0L(0Yv.A1E(arrayList, 10));
                    if (A0L < 16) {
                        A0L = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
                    for (Object next : arrayList) {
                        linkedHashMap.put(next, A022.get(next));
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        List list = (List) entry.getValue();
                        if (list != null && !list.isEmpty() && (!(list instanceof Collection) || !list.isEmpty())) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!((0bb) it.next()).A00.isEmpty()) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                    if (!linkedHashMap2.isEmpty()) {
                        StringBuilder sb = new StringBuilder("Tracking nodes with missing data: \n");
                        for (Object next2 : linkedHashMap2.keySet()) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(" - ");
                            sb2.append(next2);
                            sb2.append(10);
                            sb.append(sb2.toString());
                        }
                        sb.append("\n\n");
                        sb.append(String.valueOf(hashMap.get(r4.getId())));
                        0f9 AEf = r8.A00.AEf("litho_pc_mismatch", 817898450);
                        AEf.ERJ(new Throwable(sb.toString()));
                        AEf.report();
                    }
                    0u4.A03(hashMap).remove(r4.getId());
                }
            }
            this.A01.A01.remove(id);
        } else if (view != null) {
            C235182zP r2 = this.A01;
            if (r13.CFe(r12) >= r2.A00) {
                r2.A01.add(id);
            }
            if (r2.A01.contains(id)) {
                this.A03.invoke(r12, r13, id);
                AnonymousClass57S r5 = this.A02;
                if (r5 != null) {
                    Object invoke = r5.A03.invoke(obj);
                    HashMap hashMap2 = r5.A01;
                    if (!hashMap2.containsKey(invoke)) {
                        hashMap2.put(invoke, new C61057Jvv((Map) r5.A04.invoke(obj, r12.A04)));
                    }
                    C61057Jvv jvv = (C61057Jvv) hashMap2.get(invoke);
                    if (jvv != null) {
                        float CFe = r13.CFe(r12);
                        jvv.A02 = true;
                        for (Object next3 : r5.A02) {
                            IgImageView findViewWithTag = view.findViewWithTag(next3);
                            if (findViewWithTag != null) {
                                Map map = (Map) jvv.A04;
                                Object obj2 = map.get(next3);
                                if (obj2 == null) {
                                    obj2 = new LinkedHashMap();
                                    map.put(next3, obj2);
                                }
                                Map map2 = (Map) obj2;
                                map2.put("is_shown", Boolean.valueOf(findViewWithTag.isShown()));
                                if (findViewWithTag instanceof IgImageView) {
                                    IgImageView igImageView = findViewWithTag;
                                    map2.put("is_fully_loaded", Boolean.valueOf(igImageView.A0N));
                                    boolean z = false;
                                    if (igImageView.getDrawable() == null) {
                                        z = true;
                                    }
                                    A0P = Boolean.valueOf(z);
                                    A002 = "is_drawable_null";
                                } else if (findViewWithTag instanceof ComponentHost) {
                                    A0P = 00k.A0P(",", "", "", ((ComponentHost) findViewWithTag).getTextContentText(), DOI.A00);
                                    A002 = AnonymousClass000.A00(4097);
                                }
                                map2.put(A002, A0P);
                            }
                        }
                        ((List) jvv.A01).add(Float.valueOf(CFe));
                        ((List) jvv.A05).add(Long.valueOf(System.currentTimeMillis()));
                        return;
                    }
                    throw new IllegalStateException("Should have information about model");
                }
            }
        }
    }
}
