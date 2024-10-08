package X;

import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

public final class MYS implements 1OW {
    public final /* bridge */ /* synthetic */ Object E1o(16F r2) {
        0qQ.A0B(r2, 0);
        C66351mM parseFromJson = C70249Nzf.parseFromJson(r2);
        0qQ.A07(parseFromJson);
        return parseFromJson;
    }

    public final void ENE(17Z r3, Object obj) {
        String str;
        AnonymousClass7TG.A1N(r3, obj);
        C66351mM r4 = (C66351mM) obj;
        r3.A0c();
        String str2 = r4.A03;
        if (str2 != null) {
            r3.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            String str3 = r4.A01;
            if (str3 != null) {
                r3.A0R("item_id", str3);
                String str4 = r4.A02;
                str = "otid";
                if (str4 != null) {
                    r3.A0R(str, str4);
                    if (r4.A00 != null) {
                        r3.A0q("one_click_upsell");
                        C300605xU.A00(r4.A00, r3);
                    }
                    C66670Mad.A00(r3, r4);
                    r3.A0Z();
                    return;
                }
            } else {
                str = "itemId";
            }
        } else {
            str = "threadId";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
