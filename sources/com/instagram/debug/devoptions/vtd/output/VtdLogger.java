package com.instagram.debug.devoptions.vtd.output;

import X.002;
import X.00k;
import X.0qQ;
import X.AnonymousClass7TG;
import X.C51968G9o;
import X.C66581MXm;
import X.G9w;
import X.JTR;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;

public final class VtdLogger {
    public final void logAttached(View view) {
        0qQ.A0B(view, 0);
        logVTD(VtdIssueCategory.ATTACHED.getTag(), view);
    }

    public final void logHidden(View view) {
        0qQ.A0B(view, 0);
        logVTD(VtdIssueCategory.VISIBILITY.getTag(), view);
    }

    private final String getParentHierarchy(View view) {
        ArrayList arrayList = new ArrayList();
        while ((view.getParent() instanceof View) && arrayList.size() < 5) {
            view = JTR.A0U(view);
            arrayList.add(002.A0R(C51968G9o.A16(view), getId(view)));
        }
        return C66581MXm.A0w(" -> ", 00k.A0Y(arrayList));
    }

    private final String getId(View view) {
        String str = "";
        if (view.getId() == -1 || view.getId() == 0 || view.getId() == 1) {
            return str;
        }
        try {
            str = view.getResources().getResourceEntryName(view.getId());
        } catch (Resources.NotFoundException e) {
            Log.e("[VTD-ERROR]", 002.A0O("Failed to get resource entry name for id ", view.getId()), e);
        }
        return G9w.A0k(" (", str);
    }

    public final void logVTD(String str, View view) {
        AnonymousClass7TG.A1N(str, view);
        getParentHierarchy(view);
        getId(view);
    }
}
