package X;

import androidx.appcompat.widget.ActionBarContextView;

public abstract class V4T {
    public Object A00;
    public boolean A01;

    public final void A00() {
        if (this instanceof C14730U5q) {
            C14730U5q u5q = (C14730U5q) this;
            if (!u5q.A05) {
                u5q.A05 = true;
                u5q.A01.D8S(u5q);
                return;
            }
            return;
        }
        U5r u5r = (U5r) this;
        U5n u5n = u5r.A04;
        if (u5n.A04 == u5r) {
            if (u5n.A0F) {
                u5n.A06 = u5r;
                u5n.A05 = u5r.A00;
            } else {
                u5r.A00.D8S(u5r);
            }
            u5r.A00 = null;
            u5n.A0K(false);
            ActionBarContextView actionBarContextView = u5n.A09;
            if (actionBarContextView.A01 == null) {
                actionBarContextView.A04();
            }
            u5n.A0A.setHideOnContentScrollEnabled(u5n.A0G);
            u5n.A04 = null;
        }
    }

    public final void A01() {
        if (this instanceof C14730U5q) {
            C14730U5q u5q = (C14730U5q) this;
            u5q.A01.DYm(u5q.A02, u5q);
            return;
        }
        U5r u5r = (U5r) this;
        if (u5r.A04.A04 == u5r) {
            C18932WDk wDk = u5r.A03;
            wDk.A06();
            try {
                u5r.A00.DYm(wDk, u5r);
            } finally {
                wDk.A05();
            }
        }
    }
}
