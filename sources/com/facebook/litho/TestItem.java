package com.facebook.litho;

import X.018;
import X.0sP;
import X.AnonymousClass5FD;
import X.AnonymousClass7TE;
import X.C246283eK;
import X.DbT;
import X.DbV;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class TestItem {
    public ComponentHost A00;
    public Object A01;
    public String A02;
    public final Rect A03 = AnonymousClass7TE.A0W();
    public final AcquireKey A04 = new Object();

    public final class AcquireKey {
    }

    public final AcquireKey getAcquireKey() {
        return this.A04;
    }

    public final Rect getBounds() {
        return this.A03;
    }

    public final ComponentHost getHost() {
        return this.A00;
    }

    public final String getTestKey() {
        return this.A02;
    }

    public final String getTextContent() {
        List singletonList;
        List singletonList2 = Collections.singletonList(this.A01);
        ArrayList<TextContent> A15 = DbV.A15(singletonList2);
        for (Object next : singletonList2) {
            if (next instanceof TextContent) {
                A15.add(next);
            }
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (TextContent textContent : A15) {
            AnonymousClass5FD A012 = C246283eK.A01((C246283eK) textContent);
            if (A012 == null) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(A012.A06);
            }
            018.A16(singletonList, A1C);
        }
        return DbT.A0z(", ", A1C, (0sP) null);
    }
}
