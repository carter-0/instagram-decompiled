package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.google.common.collect.ImmutableList;
import com.instagram.ar.core.effectcollection.EffectCollectionService;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.9KQ  reason: invalid class name */
public final class AnonymousClass9KQ extends AnonymousClass1Ek implements 0sK {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.A03;
        AnonymousClass4D7 r5 = (AnonymousClass4D7) obj3;
        EffectCollectionService effectCollectionService = (EffectCollectionService) this.A06;
        C349177zi r2 = (C349177zi) this.A05;
        C346077uZ r4 = (C346077uZ) this.A04;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        AnonymousClass9KQ r1 = new AnonymousClass9KQ(r2, effectCollectionService, r4, r5, i);
        r1.A01 = obj;
        r1.A02 = obj2;
        return r1.invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KQ(C349177zi r2, EffectCollectionService effectCollectionService, C346077uZ r4, AnonymousClass4D7 r5, int i) {
        super(3, r5);
        this.A03 = i;
        this.A06 = effectCollectionService;
        this.A05 = r2;
        this.A04 = r4;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.9KQ, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object r1;
        Integer num;
        0rr r9;
        Object A022;
        0rr A023;
        int i = this.A03;
        Object obj3 = 1Hj.A02;
        int i2 = this.A00;
        if (i != 0) {
            if (i2 == 0) {
                0eS.A00(obj);
                02o r11 = (02o) this.A01;
                C239803Ii r10 = (C239803Ii) this.A02;
                EffectCollectionService effectCollectionService = (EffectCollectionService) this.A06;
                C349177zi r2 = (C349177zi) this.A05;
                C346077uZ r92 = (C346077uZ) this.A04;
                if (r10 instanceof C239793Ih) {
                    A023 = new 0rr(r10);
                } else if (r10 instanceof C297815sO) {
                    long j = effectCollectionService.A02;
                    C359218cI r14 = r2.A01;
                    String str = r2.A03;
                    Integer num2 = r2.A02;
                    boolean z = r2.A06;
                    boolean z2 = r2.A05;
                    boolean z3 = r2.A07;
                    0qQ.A0B(r14, 0);
                    A023 = 10q.A02(new AnonymousClass9KL(r92, r10, (AnonymousClass4D7) null), new AnonymousClass05E(new AnonymousClass9KF((Object) new C349177zi(r14, num2, str, j, true, true, z, z2, z3), (AnonymousClass4D7) null, (Object) effectCollectionService, 11)));
                } else {
                    throw new RuntimeException();
                }
                this.A00 = 1;
                A022 = AnonymousClass11O.A02(this, A023, r11);
            }
            0eS.A00(obj);
            return C60340gF.A00;
        }
        if (i2 == 0) {
            0eS.A00(obj);
            02o r8 = (02o) this.A01;
            C346197ul r3 = (C346197ul) this.A02;
            if (r3 != null) {
                C376519Ih r0 = (C376519Ih) r3.A00;
                ((C346077uZ) this.A04).A01(((List) r0.A02).size(), (Integer) r0.A03);
                r1 = new C239793Ih(r3);
            } else {
                EffectCollectionService effectCollectionService2 = (EffectCollectionService) this.A06;
                if (C61970qY.A0E(effectCollectionService2.A03)) {
                    C349177zi r32 = (C349177zi) this.A05;
                    Object obj4 = this.A04;
                    if (!(!0JN.A01().A0A())) {
                        obj2 = C384759hq.A00;
                    } else {
                        UserSession userSession = effectCollectionService2.A05;
                        C61410nE r02 = effectCollectionService2.A06;
                        0qQ.A0B(r02, 1);
                        C346217un r93 = new C346217un(userSession, r02);
                        C359218cI r22 = r32.A01;
                        String str2 = r32.A03;
                        long j2 = effectCollectionService2.A00;
                        boolean z4 = r32.A06;
                        boolean z5 = r32.A05;
                        boolean z6 = r32.A07;
                        0qQ.A0B(r22, 0);
                        0lg r20 = r93.A01;
                        String str3 = r22.A02;
                        2IV A012 = C278474ww.A01(r20);
                        2IS r15 = new 2IS();
                        r15.A00(A012, "device_capabilities");
                        ImmutableList of = ImmutableList.of("TAR_BROTLI", "ZIP");
                        0qQ.A07(of);
                        r15.A05("supported_compression_types", of);
                        r15.A04("cursor", str2);
                        r15.A03("preview_width", 240);
                        r15.A03("preview_height", 240);
                        String str4 = r22.A01;
                        r15.A04("product_category_identifier", str4);
                        r15.A04("product", str3);
                        r15.A03("thumbnail_width", 240);
                        r15.A03("thumbnail_height", 240);
                        r15.A02("include_preview_image", Boolean.valueOf(z4));
                        r15.A02("include_flm_effects", Boolean.valueOf(z5));
                        r15.A04("effect_action_sheet_surface", "CAMERA");
                        r15.A02("formatted_media_count_enabled", false);
                        r15.A02("is_ads_mode", Boolean.valueOf(z6));
                        TreeMap treeMap = new TreeMap();
                        GraphQlCallInput.A01(A012.A00, A012, treeMap);
                        if (treeMap.containsKey("supported_texture_formats")) {
                            Object obj5 = treeMap.get("supported_texture_formats");
                            if (obj5 instanceof List) {
                                ArrayList arrayList = new ArrayList();
                                for (Object next : (Iterable) obj5) {
                                    if (next instanceof String) {
                                        arrayList.add(next);
                                    }
                                }
                                r15.A05("supported_texture_formats", ImmutableList.copyOf((Collection) arrayList));
                            }
                        }
                        C239113Fa r112 = new C239113Fa(r15, C346237up.class, "IGAREffectCollectionQuery", false);
                        StringBuilder sb = new StringBuilder();
                        sb.append(r20.A06);
                        sb.append('_');
                        sb.append(str3);
                        sb.append('_');
                        sb.append(str4);
                        sb.append('_');
                        sb.append(str2);
                        String A0O = 002.A0O("effect_collection_", sb.toString().hashCode());
                        boolean z7 = false;
                        if (j2 > 0) {
                            z7 = true;
                        }
                        0qQ.A0B(A0O, 3);
                        C239123Fb r12 = new C239123Fb(r20);
                        r12.A08(r112);
                        if (z7) {
                            1JQ r03 = 1JQ.A05;
                            if (r03 == null || !r03.A02(A0O)) {
                                num = AnonymousClass05K.A01;
                            } else {
                                num = AnonymousClass05K.A0C;
                            }
                        } else {
                            num = AnonymousClass05K.A00;
                        }
                        r12.A03 = num;
                        String str5 = null;
                        if (z7) {
                            str5 = A0O;
                        }
                        r12.A05 = str5;
                        r12.A04 = Long.valueOf(j2);
                        C349177zi r113 = r32;
                        EffectCollectionService effectCollectionService3 = effectCollectionService2;
                        Object obj6 = obj4;
                        r9 = new AnonymousClass9PS(0, r113, effectCollectionService3, obj6, C349197zk.A00(new AnonymousClass9KB(r93, r22, (AnonymousClass4D7) null, 1), new C343637qX(new C376879Jr(9, (AnonymousClass4D7) null), r12.A06().A04(697, 3))));
                        this.A00 = 1;
                        A022 = AnonymousClass11O.A02(this, r9, r8);
                    }
                } else {
                    obj2 = C384769hr.A00;
                }
                r1 = new C297815sO(obj2);
            }
            r9 = new 0rr(r1);
            this.A00 = 1;
            A022 = AnonymousClass11O.A02(this, r9, r8);
        }
        0eS.A00(obj);
        return C60340gF.A00;
        if (A022 == obj3) {
            return obj3;
        }
        return C60340gF.A00;
    }
}
