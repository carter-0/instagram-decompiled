package com.facebook.react.devsupport;

import X.0qQ;
import X.C13435TaN;
import X.C13946Tlt;
import X.C18773W0w;
import X.C9534RcX;
import X.QZK;
import X.SpR;
import X.TCI;
import X.TCJ;
import X.TCK;
import com.facebook.fbreact.specs.NativeLogBoxSpec;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "LogBox")
public final class LogBoxModule extends NativeLogBoxSpec {
    public static final C9534RcX Companion = new Object();
    public static final String NAME = "LogBox";
    public final C13946Tlt devSupportManager;
    public final C13435TaN surfaceDelegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LogBoxModule(QZK qzk, C13946Tlt tlt) {
        super(qzk);
        0qQ.A0B(tlt, 2);
        this.devSupportManager = tlt;
        this.surfaceDelegate = new SpR(tlt);
    }

    public void hide() {
        C18773W0w.A01(new TCI(this));
    }

    public void invalidate() {
        C18773W0w.A01(new TCJ(this));
    }

    public void show() {
        C18773W0w.A01(new TCK(this));
    }
}
