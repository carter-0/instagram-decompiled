package X;

import com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder;
import com.facebook.commonavatarliveediting.CdlProviderImpl;
import com.facebook.fbavatar.cdsavatareditor.liveediting.common.CommonLiveEditingProvider$setRichAvatarViewAlpha$1;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* renamed from: X.VlB  reason: case insensitive filesystem */
public abstract class C18081VlB {
    public int A00;
    public int A01;
    public C17653Vbj A02;
    public String A03;
    public String A04;
    public String A05;
    public Map A06;
    public Map A07;
    public Map A08;
    public Map A09 = 0Yt.A0E();
    public Map A0A = 0Yt.A0E();
    public Map A0B = 0Yt.A0E();
    public final C64301LZb A0C;
    public final Object A0D = new Object();
    public final CopyOnWriteArrayList A0E = new CopyOnWriteArrayList();

    public final void A05(V2A v2a) {
        C18073Vl1 vl1;
        String str;
        C17788Vg0 vg0;
        Iterator it = this.A0E.iterator();
        while (it.hasNext()) {
            C18741VzM vzM = (C18741VzM) it.next();
            V2A v2a2 = v2a;
            if (v2a2 instanceof UIB) {
                if (((UIB) v2a2).A00) {
                    C18741VzM.A00(vzM);
                }
                C18073Vl1 vl12 = vzM.A05;
                if (vl12 != null) {
                    vl12.A02("CDL_GENERATE_AVATAR");
                }
            } else if (!(v2a2 instanceof UI9) && !(v2a2 instanceof UI8)) {
                if (v2a2 instanceof UID) {
                    if (((UID) v2a2).A01) {
                        C18741VzM.A00(vzM);
                    }
                    C17788Vg0 vg02 = vzM.A02;
                    if (vg02 != null) {
                        vg02.A00(AnonymousClass05K.A0N, (String) null);
                    }
                    C18073Vl1 vl13 = vzM.A05;
                    if (vl13 != null) {
                        vl13.A02("AVATAR_MEMORY_LOAD");
                    }
                } else if (v2a2 instanceof UIC) {
                    C18073Vl1 vl14 = vzM.A05;
                    if (vl14 != null) {
                        vl14.A01("CDL_GENERATE_AVATAR");
                    }
                    C18073Vl1 vl15 = vzM.A05;
                    if (vl15 != null) {
                        vl15.A03("isAvatarFetchedFromCache", Boolean.valueOf(((UIC) v2a2).A01));
                    }
                } else {
                    if (v2a2 instanceof UIA) {
                        String str2 = ((UIA) v2a2).A00;
                        C18741VzM.A01(vzM);
                        C18006Vji vji = vzM.A03;
                        if (vji != null) {
                            vji.A03.A00();
                            vji.A01(C16482Uvc.A02, str2);
                            vl1 = vzM.A05;
                            if (vl1 != null) {
                                str = "CDL_AVATAR_GENERATION_FAILED";
                            }
                        } else {
                            0qQ.A0F("fallbackLogic");
                            throw AnonymousClass00P.createAndThrow();
                        }
                    } else if (v2a2 instanceof C60806Jrb) {
                        C18073Vl1 vl16 = vzM.A05;
                        if (vl16 != null) {
                            vl16.A01("EFFECT_RENDER");
                        }
                        C262224Cq r3 = vzM.A0C;
                        AnonymousClass4CZ r0 = AnonymousClass12W.A01;
                        1Eo.A05(AnonymousClass12y.A00, new CommonLiveEditingProvider$setRichAvatarViewAlpha$1(vzM, (AnonymousClass4D7) null, 1.0f), r3);
                        C17788Vg0 vg03 = vzM.A02;
                        if (vg03 != null) {
                            vg03.A00(AnonymousClass05K.A01, (String) null);
                        }
                    } else if ((v2a2 instanceof C60804JrZ) || (v2a2 instanceof C60805Jra)) {
                        C18006Vji vji2 = vzM.A03;
                        if (vji2 != null) {
                            vji2.A03.A00();
                            vji2.A01(C16482Uvc.A03, (String) null);
                            vl1 = vzM.A05;
                            if (vl1 != null) {
                                str = "EFFECT_RENDER_FAILED";
                            }
                        } else {
                            0qQ.A0F("fallbackLogic");
                            throw AnonymousClass00P.createAndThrow();
                        }
                    } else if ((v2a2 instanceof UI7) && (vg0 = vzM.A02) != null) {
                        0eP r02 = ((UI7) v2a2).A00;
                        String str3 = (String) r02.A00;
                        String obj = r02.A01.toString();
                        0qQ.A0B(str3, 0);
                        if (obj != null) {
                            C307786Rm r12 = vg0.A00;
                            C276544tV r10 = vg0.A01;
                            C277014uI A0A2 = r10.A0A(56);
                            if (A0A2 != null) {
                                AnonymousClass4CZ r03 = AnonymousClass12W.A01;
                                AnonymousClass7TE.A1Z(new C73557Pf9(r10, A0A2, r12, str3, obj, (AnonymousClass4D7) null, 1), 19E.A02(AnonymousClass12y.A00));
                            }
                        }
                    }
                    vl1.A04(str, 3);
                }
            }
        }
    }

    public void A02() {
        this.A0C.A01 = null;
    }

    public final void A03() {
        String str;
        int i = this.A01;
        int i2 = this.A00;
        if (this.A03 != null && i == i2) {
            C64301LZb lZb = this.A0C;
            JSONObject A022 = C18668VwQ.A02("complete");
            C64164LRf lRf = lZb.A00;
            if (lRf == null) {
                str = "provider";
            } else {
                lRf.A0D.A02.A00(A022);
                Iterator it = this.A0E.iterator();
                while (it.hasNext()) {
                    C18741VzM vzM = (C18741VzM) it.next();
                    str = "fallbackLogic";
                    vzM.A0A = false;
                    C18741VzM.A01(vzM);
                    C18073Vl1 vl1 = vzM.A05;
                    if (vl1 != null) {
                        vl1.A01("AVATAR_MEMORY_LOAD");
                    }
                    C18073Vl1 vl12 = vzM.A05;
                    if (vl12 != null) {
                        vl12.A05(2);
                    }
                    vzM.A05 = null;
                    C17788Vg0 vg0 = vzM.A02;
                    if (vg0 != null) {
                        vg0.A00(AnonymousClass05K.A0Y, (String) null);
                    }
                    C18006Vji vji = vzM.A03;
                    if (vji != null) {
                        vji.A03.A00();
                    }
                }
                A04();
                return;
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A04() {
        synchronized (this.A0D) {
            this.A03 = null;
        }
    }

    public final void A06(C60808Jrd jrd) {
        if (this instanceof UIE) {
            0qQ.A0B(jrd, 0);
            if (jrd.A01) {
                this.A01 |= 1;
                A03();
            } else if (this.A03 != null) {
                Iterator it = this.A0E.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                C64301LZb lZb = this.A0C;
                JSONObject A022 = C18668VwQ.A02("error");
                C64164LRf lRf = lZb.A00;
                if (lRf == null) {
                    0qQ.A0F("provider");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    lRf.A0D.A02.A00(A022);
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
    }

    public final void A07(C60807Jrc jrc) {
        if (this instanceof UIE) {
            UIE uie = (UIE) this;
            0qQ.A0B(jrc, 0);
            uie.A02 = jrc.A00;
            UIE.A00(uie);
            UIE.A01(uie);
        }
    }

    public final void A08(String str, Map map) {
        boolean z;
        if (this instanceof UIE) {
            UIE uie = (UIE) this;
            0qQ.A0B(str, 0);
            MTM mtm = (MTM) uie.A03.get();
            if (mtm != null) {
                TY5 ty5 = new TY5(uie, 14);
                L7W l7w = ((CdlProviderImpl) mtm).A00;
                if (l7w != null) {
                    C73943PmN pmN = new C73943PmN(str, ty5, 3);
                    LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder = new LiveEditingRawMemoryPointerHolder();
                    l7w.A00.generateBlendWeightsForConfig(map, liveEditingRawMemoryPointerHolder, new C64361Lad(liveEditingRawMemoryPointerHolder, pmN));
                }
            }
        } else if (this instanceof UIG) {
            UIG uig = (UIG) this;
            0qQ.A0B(str, 0);
            if (uig.A04) {
                Map map2 = uig.A09;
                C15046UKz uKz = uig.A00;
                if (uKz != null) {
                    z = uKz.A0D;
                } else {
                    z = false;
                }
                LinkedHashMap A042 = 0Yt.A04(map2, C18668VwQ.A00(map, z));
                0qQ.A0B(A042, 0);
                uig.A09 = A042;
            } else if (!0qQ.A0K(uig.A03, map) && !map.isEmpty()) {
                uig.A03 = map;
                C17973VjA vjA = (C17973VjA) uig.A02.get();
                if (vjA != null) {
                    VQW vqw = vjA.A00;
                    if (vqw == null) {
                        0qQ.A0F("aleBridge");
                        throw AnonymousClass00P.createAndThrow();
                    } else {
                        vqw.A00.updateBlendWeights(str, map);
                    }
                }
            }
        }
    }

    public final void A09(String str, Map map) {
        C17973VjA vjA;
        if (!(this instanceof UIE) && (this instanceof UIG)) {
            UIG uig = (UIG) this;
            0qQ.A0B(str, 0);
            if (uig.A04) {
                LinkedHashMap A042 = 0Yt.A04(uig.A09, map);
                0qQ.A0B(A042, 0);
                uig.A09 = A042;
            } else if (!map.isEmpty() && (vjA = (C17973VjA) uig.A02.get()) != null) {
                VQW vqw = vjA.A00;
                if (vqw == null) {
                    0qQ.A0F("aleBridge");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    vqw.A00.updateAvatarBodyMorphs(str, map);
                }
            }
        }
    }

    public final void A0A(String str, Map map) {
        C17973VjA vjA;
        if (!(this instanceof UIE) && (this instanceof UIG)) {
            UIG uig = (UIG) this;
            0qQ.A0B(str, 0);
            if (uig.A04) {
                LinkedHashMap A042 = 0Yt.A04(uig.A0B, map);
                0qQ.A0B(A042, 0);
                uig.A0B = A042;
            } else if (!map.isEmpty() && (vjA = (C17973VjA) uig.A02.get()) != null) {
                VQW vqw = vjA.A00;
                if (vqw == null) {
                    0qQ.A0F("aleBridge");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    vqw.A00.updateAvatarSkeleton(str, map);
                }
            }
        }
    }

    public final void A0B(String str, Map map, Float[] fArr) {
        String str2 = str;
        Map map2 = map;
        if (this instanceof UIE) {
            UIE uie = (UIE) this;
            0qQ.A0B(str, 0);
            if (!0qQ.A0K(uie.A06, map)) {
                uie.A01 = (uie.A01 | 2) ^ 2;
                uie.A04 = str;
                uie.A06 = map;
                uie.A01 = null;
                Iterator it = uie.A0E.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                MTM mtm = (MTM) uie.A03.get();
                if (mtm != null) {
                    C73943PmN pmN = new C73943PmN(str, uie, 4);
                    CdlProviderImpl cdlProviderImpl = (CdlProviderImpl) mtm;
                    synchronized (cdlProviderImpl) {
                        HashMap hashMap = cdlProviderImpl.A05;
                        C262224Cq r1 = cdlProviderImpl.A09;
                        hashMap.put(str, 1Eo.A04(19B.A00, new MH7(fArr, map2, cdlProviderImpl, pmN, str2, (AnonymousClass4D7) null, 1), r1));
                    }
                }
            }
        } else if (this instanceof UIG) {
            UIG uig = (UIG) this;
            0qQ.A0B(str, 0);
            if (uig.A04) {
                LinkedHashMap A042 = 0Yt.A04(uig.A0A, map);
                0qQ.A0B(A042, 0);
                uig.A0A = A042;
            } else if (!0qQ.A0K(uig.A06, map) && !map.isEmpty()) {
                uig.A01 = (uig.A01 | 2) ^ 2;
                Iterator it2 = uig.A0E.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
                uig.A03 = str;
                uig.A06 = map;
                C17973VjA vjA = (C17973VjA) uig.A02.get();
                if (vjA != null) {
                    VQW vqw = vjA.A00;
                    if (vqw == null) {
                        0qQ.A0F("aleBridge");
                        throw AnonymousClass00P.createAndThrow();
                    } else {
                        vqw.A00.requestAvatarUpdate(1, str, map, true);
                    }
                }
            }
        }
    }

    public final void A0C(Map map) {
        String str;
        boolean z;
        if (this instanceof UIG) {
            UIG uig = (UIG) this;
            Map map2 = uig.A08;
            if (map2 != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator A0u = AnonymousClass7TF.A0u(map2);
                while (A0u.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                    if (map.containsKey(A1J.getKey())) {
                        Dbb.A1V(A1J, linkedHashMap);
                    }
                }
                C15046UKz uKz = uig.A00;
                if (uKz != null) {
                    z = uKz.A0D;
                } else {
                    z = false;
                }
                LinkedHashMap A042 = 0Yt.A04(linkedHashMap, C18668VwQ.A00(map, z));
                C17973VjA vjA = (C17973VjA) uig.A02.get();
                if (vjA != null) {
                    String A10 = DbT.A10(C16772V5f.A00());
                    boolean A1Y = DbW.A1Y(A042);
                    VQW vqw = vjA.A00;
                    if (vqw == null) {
                        str = "aleBridge";
                    } else {
                        vqw.A00.requestAvatarUpdate(A1Y ? 1 : 0, A10, A042, A1Y);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if ((this.A01 & 4) != 0) {
            C64164LRf lRf = this.A0C.A00;
            if (lRf == null) {
                str = "provider";
            } else {
                lRf.A0E.A00.updateSliderValues(map);
                return;
            }
        } else {
            this.A07 = map;
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0D(JSONObject jSONObject) {
        C64164LRf lRf = this.A0C.A00;
        if (lRf == null) {
            0qQ.A0F("provider");
            throw AnonymousClass00P.createAndThrow();
        } else {
            lRf.A0D.A02.A00(jSONObject);
        }
    }

    public final boolean A0E(GSY gsy) {
        if (this instanceof UIE) {
            UIE uie = (UIE) this;
            String str = gsy.A02;
            String str2 = gsy.A03;
            if (0qQ.A0K(str2, uie.A05)) {
                return false;
            }
            uie.A05 = str2;
            uie.A03 = str;
            uie.A00 = null;
            boolean containsKey = gsy.A05().containsKey("root");
            int i = 5;
            if (containsKey) {
                i = 7;
            }
            uie.A00 = i;
            uie.A01 &= 4;
            String str3 = uie.A03;
            if (str3 != null) {
                uie.A05(new UID(str3, false));
                MTM mtm = (MTM) uie.A03.get();
                if (mtm != null) {
                    mtm.AWc(Boolean.valueOf(containsKey), (Integer) null, str, gsy.A05(), new C59819JZr((AnonymousClass4D7) null, (Object) uie, (Object) gsy, 7));
                }
                return true;
            }
            throw AnonymousClass7TE.A0y();
        }
        if (this instanceof UIG) {
            UIG uig = (UIG) this;
            String str4 = gsy.A02;
            if (uig.A01 == null) {
                uig.A01 = gsy;
            }
            uig.A05 = gsy.A03;
            uig.A03 = str4;
            uig.A04 = true;
            if (str4 != null) {
                uig.A05(new UID(str4, true));
                int i2 = 5;
                if (gsy.A05().containsKey("root")) {
                    i2 = 7;
                }
                uig.A00 = i2;
                uig.A01 &= 4;
                C17973VjA vjA = (C17973VjA) uig.A02.get();
                if (vjA == null) {
                    return true;
                }
                Map A052 = gsy.A05();
                VQW vqw = vjA.A00;
                if (vqw != null) {
                    vqw.A00.requestAvatarUpdate(0, str4, A052, true);
                    return true;
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        } else {
            UIF uif = (UIF) this;
            String str5 = gsy.A02;
            if (uif.A01 == null) {
                uif.A01 = gsy;
            }
            uif.A03 = str5;
            if (str5 != null) {
                uif.A05(new UID(str5, true));
                uif.A00 = 7;
                uif.A01 &= 4;
                WeakReference weakReference = uif.A02;
                C17973VjA vjA2 = (C17973VjA) weakReference.get();
                if (vjA2 != null) {
                    vjA2.A00(uif);
                    C64301LZb lZb = uif.A04;
                    VQW vqw2 = vjA2.A00;
                    if (vqw2 != null) {
                        LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder = new LiveEditingRawMemoryPointerHolder();
                        vqw2.A00.getAlePointerHolder(liveEditingRawMemoryPointerHolder);
                        lZb.A02(liveEditingRawMemoryPointerHolder);
                    }
                }
                C17973VjA vjA3 = (C17973VjA) weakReference.get();
                if (vjA3 == null) {
                    return true;
                }
                Map A053 = gsy.A05();
                VQW vqw3 = vjA3.A00;
                if (vqw3 != null) {
                    vqw3.A00.requestAvatarUpdate(0, str5, A053, false);
                    return true;
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        0qQ.A0F("aleBridge");
        throw AnonymousClass00P.createAndThrow();
    }

    public C18081VlB(C64301LZb lZb) {
        this.A0C = lZb;
    }
}
