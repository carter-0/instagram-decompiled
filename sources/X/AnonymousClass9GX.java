package X;

import com.instagram.business.onelink.cache.WhatsAppBusinessCacheInfo;

/* renamed from: X.9GX  reason: invalid class name */
public final class AnonymousClass9GX extends 1P0 {
    public final /* synthetic */ AnonymousClass9JK A00;
    public final /* synthetic */ AnonymousClass9F6 A01;
    public final /* synthetic */ AnonymousClass9F2 A02;
    public final /* synthetic */ AnonymousClass9FE A03;

    public AnonymousClass9GX(AnonymousClass9JK r1, AnonymousClass9F6 r2, AnonymousClass9F2 r3, AnonymousClass9FE r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C250663lr optionalTreeField;
        C250663lr optionalTreeField2;
        String str;
        C375999Gd r11;
        int A032 = AnonymousClass0fD.A03(-1416198068);
        AnonymousClass3JC r5 = (AnonymousClass3JC) obj;
        int A033 = AnonymousClass0fD.A03(-477226934);
        0qQ.A0B(r5, 0);
        AnonymousClass9F6 r2 = this.A01;
        AnonymousClass9F2 r1 = this.A02;
        AnonymousClass9JK r9 = this.A00;
        AnonymousClass9FE r0 = this.A03;
        C250663lr r10 = (C250663lr) r5.Bny();
        if (r10 == null || (optionalTreeField = r10.getOptionalTreeField(0, AnonymousClass000.A00(4265), AnonymousClass9GY.class, -1189547960)) == null || (optionalTreeField2 = optionalTreeField.getOptionalTreeField(0, "whatsapp_info", AnonymousClass9GZ.class, -1198104823)) == null) {
            if (r1 instanceof AnonymousClass9F1) {
                r2.A00 = null;
                AnonymousClass9F8 r8 = r2.A01;
                0xW.A09(r8.A00, new C377189Kw(r8, 43));
                r2.A03.A00(C376029Gg.A00);
            }
            r2.A02.A00(r9, r1);
            r0.onError(new Throwable(AnonymousClass000.A00(2540)));
        } else {
            String optionalStringField = optionalTreeField2.getOptionalStringField(3, AnonymousClass000.A00(3507));
            C375989Ga r52 = (C375989Ga) optionalTreeField2.getOptionalEnumField(4, "linked_whatsapp_account_type", C375989Ga.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            if (r52 != null) {
                str = r52.name();
            } else {
                str = null;
            }
            WhatsAppBusinessCacheInfo whatsAppBusinessCacheInfo = new WhatsAppBusinessCacheInfo(optionalStringField, str, optionalTreeField2.getCoercedBooleanField(1, AnonymousClass000.A00(1526)), optionalTreeField2.getCoercedBooleanField(0, "is_linked_whatsapp_number_banned"), optionalTreeField2.getCoercedBooleanField(2, AnonymousClass000.A00(1498)));
            String str2 = whatsAppBusinessCacheInfo.A01;
            if (str2 != null) {
                r11 = new C375999Gd(str2);
            } else {
                r11 = null;
            }
            C376009Ge r102 = new C376009Ge(r11, whatsAppBusinessCacheInfo.A00, whatsAppBusinessCacheInfo.A03, whatsAppBusinessCacheInfo.A04, whatsAppBusinessCacheInfo.A02);
            if (r1 instanceof AnonymousClass9F1) {
                r2.A00 = r102;
                AnonymousClass9F8 r7 = r2.A01;
                0xW.A09(r7.A00, new C377469Ly(30, (Object) r7, (Object) whatsAppBusinessCacheInfo));
                r2.A03.A00(C376029Gg.A00);
            }
            r0.onSuccess(r102);
        }
        AnonymousClass0fD.A0A(1691247388, A033);
        AnonymousClass0fD.A0A(-655073108, A032);
    }

    public final void onFail(C268654dm r7) {
        int A032 = AnonymousClass0fD.A03(901623952);
        0qQ.A0B(r7, 0);
        Throwable A012 = r7.A01();
        if (A012 != null) {
            AnonymousClass9F6 r0 = this.A01;
            AnonymousClass9F2 r3 = this.A02;
            AnonymousClass9FE r2 = this.A03;
            r0.A02.A01(r3, A012.getMessage());
            r2.onError(A012);
        }
        AnonymousClass0fD.A0A(1735424740, A032);
    }
}
