package X;

import android.util.Pair;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.rsys.tslog.gen.TslogCounterApi;
import com.facebook.rsys.tslog.gen.TslogStreamApi;
import com.instagram.rtc.rsys.tslog.IgRadioTsLoggerEngine;

/* renamed from: X.XbK  reason: case insensitive filesystem */
public final class C21456XbK {
    public Pair A00 = C61970qY.A03(C62670v5.A0B.A01().A03());
    public 1EK A01;
    public final TslogCounterApi A02;
    public final TslogCounterApi A03;
    public final TslogCounterApi A04;
    public final TslogCounterApi A05;
    public final TslogCounterApi A06;
    public final TslogCounterApi A07;
    public final TslogCounterApi A08;
    public final TslogCounterApi A09;
    public final TslogCounterApi A0A;
    public final TslogCounterApi A0B;
    public final /* synthetic */ IgRadioTsLoggerEngine A0C;

    public C21456XbK(TslogStreamApi tslogStreamApi, IgRadioTsLoggerEngine igRadioTsLoggerEngine) {
        this.A0C = igRadioTsLoggerEngine;
        TslogCounterApi createCounter = tslogStreamApi.createCounter("cell_updates_count", 1);
        0qQ.A07(createCounter);
        this.A08 = createCounter;
        TslogCounterApi createCounter2 = tslogStreamApi.createCounter(TraceFieldType.NetworkType, 4);
        0qQ.A07(createCounter2);
        this.A09 = createCounter2;
        TslogCounterApi createCounter3 = tslogStreamApi.createCounter("cell_dbm", 4);
        0qQ.A07(createCounter3);
        this.A03 = createCounter3;
        TslogCounterApi createCounter4 = tslogStreamApi.createCounter("cell_rsrp", 4);
        0qQ.A07(createCounter4);
        this.A04 = createCounter4;
        TslogCounterApi createCounter5 = tslogStreamApi.createCounter("cell_rsrq", 4);
        0qQ.A07(createCounter5);
        this.A05 = createCounter5;
        TslogCounterApi createCounter6 = tslogStreamApi.createCounter("cell_rssnr", 4);
        0qQ.A07(createCounter6);
        this.A07 = createCounter6;
        TslogCounterApi createCounter7 = tslogStreamApi.createCounter("cell_rssi", 4);
        0qQ.A07(createCounter7);
        this.A06 = createCounter7;
        TslogCounterApi createCounter8 = tslogStreamApi.createCounter("cell_cqi", 4);
        0qQ.A07(createCounter8);
        this.A02 = createCounter8;
        TslogCounterApi createCounter9 = tslogStreamApi.createCounter("wifi_frequency", 4);
        0qQ.A07(createCounter9);
        this.A0A = createCounter9;
        TslogCounterApi createCounter10 = tslogStreamApi.createCounter("wifi_rssi", 4);
        0qQ.A07(createCounter10);
        this.A0B = createCounter10;
    }
}
