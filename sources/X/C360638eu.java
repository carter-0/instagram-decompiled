package X;

import com.facebook.react.modules.intent.IntentModule;
import java.util.List;

/* renamed from: X.8eu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C360638eu extends 03J implements 0sL {
    public C360638eu(Object obj) {
        super(2, obj, C360628et.class, "genBloksThemeTemplateContext", "genBloksThemeTemplateContext(Ljava/util/List;Ljava/lang/String;)Lcom/instagram/graphql/instagramschema/calls/BloksThemeTemplateContext;", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        List list = (List) obj;
        String str = (String) obj2;
        0qQ.A0B(list, 0);
        0qQ.A0B(str, 1);
        2IV r1 = new 2IV();
        r1.A05(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, list);
        r1.A09(str, "design_system_name");
        return r1;
    }
}
