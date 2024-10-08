package com.facebook.mqtt.service;

import X.00a;
import X.00f;
import X.0KC;
import X.0qQ;
import X.26N;
import X.C12875TBp;
import X.C12876TBq;
import X.C12877TBr;
import X.C12878TBs;
import X.C2602244t;
import X.C2602344u;
import X.Pxe;
import android.content.Intent;
import android.os.IBinder;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public abstract class XplatServiceDelegate extends 00a {
    public static final 26N A01;
    public static final C2602244t A02;
    public static final C2602344u A03;
    public static final Object A04 = Pxe.A0p();
    public static final Condition A05;
    public static final ReentrantLock A06;
    public static volatile XplatServiceDelegate A07;
    public final XplatServiceDelegate$remoteBinder$1 A00 = new XplatServiceDelegate$remoteBinder$1();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XplatServiceDelegate(00f r2) {
        super(r2);
        0qQ.A0B(r2, 1);
    }

    public final int A07(Intent intent, int i, int i2) {
        A01.A01(new C12877TBr(this));
        return 2;
    }

    public final IBinder A0B(Intent intent) {
        A01.A01(new C12877TBr(this));
        return this.A00;
    }

    public final void A0F() {
        26N r1 = A01;
        r1.A01(new C12876TBq(this));
        if (A07 == this) {
            A07 = null;
            if (!r1.A02(new C12878TBs(this))) {
                0KC.A0C("MqttXplatService", "Unable to stop mqtt client. No handler available");
            }
        }
        XplatServiceDelegate.super.A0F();
    }

    static {
        26N r1 = new 26N("XplatClientDispatchThread");
        A01 = r1;
        ReentrantLock reentrantLock = new ReentrantLock();
        A06 = reentrantLock;
        A05 = reentrantLock.newCondition();
        A02 = new C2602244t(r1);
        A03 = new C2602344u(r1);
    }

    public final void A0C() {
        XplatServiceDelegate.super.A0C();
        A07 = this;
        26N r1 = A01;
        r1.A00();
        r1.A01(new C12877TBr(this));
        r1.A01(new C12875TBp(this));
    }
}
