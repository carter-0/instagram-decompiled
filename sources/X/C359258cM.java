package X;

import com.instagram.camera.effect.mq.effectmetadata.EffectTrayService;
import com.instagram.camera.effect.mq.effectmetadata.EffectTrayService$withSelectedEffect$$inlined$map$1$2;
import java.util.List;

/* renamed from: X.8cM  reason: invalid class name and case insensitive filesystem */
public final class C359258cM implements AnonymousClass0r6 {
    public final /* synthetic */ EffectTrayService A00;
    public final /* synthetic */ C359248cL A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ AnonymousClass0r6 A06;

    public C359258cM(EffectTrayService effectTrayService, C359248cL r2, String str, String str2, String str3, List list, AnonymousClass0r6 r7) {
        this.A06 = r7;
        this.A00 = effectTrayService;
        this.A01 = r2;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = list;
        this.A02 = str3;
    }

    public final Object collect(02o r10, AnonymousClass4D7 r11) {
        Object collect = this.A06.collect(new EffectTrayService$withSelectedEffect$$inlined$map$1$2(this.A00, this.A01, this.A03, this.A04, this.A02, this.A05, r10), r11);
        if (collect != 1Hj.A02) {
            return C60340gF.A00;
        }
        return collect;
    }
}
