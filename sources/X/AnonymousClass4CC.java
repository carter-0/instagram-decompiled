package X;

import android.view.View;

/* renamed from: X.4CC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4CC extends 03J implements 0sH {
    public AnonymousClass4CC(Object obj) {
        super(6, obj, C2613649h.class, "createViewTarget", "createViewTarget(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;Lcom/meta/analytics/gnv/vista/intf/VistaCallback;Lcom/meta/analytics/gnv/vista/core/VistaViewContext;Landroidx/lifecycle/LifecycleOwner;)Lcom/meta/analytics/gnv/vista/core/VistaViewTarget;", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        View view = (View) obj;
        String str = (String) obj2;
        C59560JOg jOg = (C59560JOg) obj4;
        C55748Hmj hmj = (C55748Hmj) obj5;
        0qQ.A0B(view, 0);
        0qQ.A0B(str, 1);
        0qQ.A0B(jOg, 3);
        0qQ.A0B(hmj, 4);
        return new I07(view, (AnonymousClass07Z) obj6, hmj, jOg, obj3, str);
    }
}
