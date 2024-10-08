package com.instagram.direct.armadilloexpress.transportpayload;

import X.C13662TeT;
import X.C13964TmR;
import X.C66580MXl;
import X.C68406NFn;
import X.C74232PrL;
import X.R2z;
import X.R5b;
import X.SQg;
import X.T5L;

public final class Voice extends R5b implements C13662TeT {
    public static final Voice DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 2;
    public static final int MEDIA_TRANSPORT_FIELD_NUMBER = 1;
    public static volatile C74232PrL PARSER = null;
    public static final int WAVEFORMS_FIELD_NUMBER = 3;
    public static final int WAVEFORM_SAMPLING_FREQUENCY_HZ_FIELD_NUMBER = 4;
    public int bitField0_;
    public int duration_;
    public CommonMediaTransport mediaTransport_;
    public int waveformSamplingFrequencyHz_;
    public int waveformsMemoizedSerializedSize = -1;
    public C13964TmR waveforms_ = R2z.A02;

    static {
        Voice voice = new Voice();
        DEFAULT_INSTANCE = voice;
        R5b.A0B(voice, Voice.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002င\u0001\u0003$\u0004င\u0002", new Object[]{"bitField0_", "mediaTransport_", "duration_", "waveforms_", "waveformSamplingFrequencyHz_"});
            case 3:
                return new Voice();
            case 4:
                return new C68406NFn();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (Voice.class) {
                    prL = PARSER;
                    if (prL == null) {
                        SQg sQg = T5L.A01;
                        prL = C66580MXl.A0K(DEFAULT_INSTANCE);
                        PARSER = prL;
                    }
                }
                return prL;
            default:
                throw C66580MXl.A11();
        }
    }
}
