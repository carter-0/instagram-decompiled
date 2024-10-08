package com.instagram.direct.armadilloexpress.memtransporteventpayload;

import X.C13662TeT;
import X.C66580MXl;
import X.C69513Nmv;
import X.C71824OrR;
import X.C71825OrS;
import X.C71826OrT;
import X.C74232PrL;
import X.NF7;
import X.NF8;
import X.NF9;
import X.NFA;
import X.NFB;
import X.R5b;
import X.SQg;
import X.T5L;

public final class TransportEvent extends R5b implements C13662TeT {
    public static final TransportEvent DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 2;
    public static volatile C74232PrL PARSER = null;
    public static final int PLACEHOLDER_FIELD_NUMBER = 1;
    public int bitField0_;
    public int contentCase_ = 0;
    public Object content_;

    public final class Event extends R5b implements C13662TeT {
        public static final Event DEFAULT_INSTANCE;
        public static final int DEVICE_CHANGE_FIELD_NUMBER = 1;
        public static final int ICDC_ALERT_FIELD_NUMBER = 2;
        public static volatile C74232PrL PARSER;
        public int bitField0_;
        public int eventCase_ = 0;
        public Object event_;

        public final class DeviceChange extends R5b implements C13662TeT {
            public static final DeviceChange DEFAULT_INSTANCE;
            public static final int DEVICE_NAME_FIELD_NUMBER = 2;
            public static volatile C74232PrL PARSER = null;
            public static final int TYPE_FIELD_NUMBER = 1;
            public int bitField0_;
            public String deviceName_ = "";
            public int type_;

            static {
                DeviceChange deviceChange = new DeviceChange();
                DEFAULT_INSTANCE = deviceChange;
                R5b.A0B(deviceChange, DeviceChange.class);
            }

            public final C69513Nmv A0L() {
                int i = this.type_;
                if (i != 0) {
                    if (i == 1) {
                        return C69513Nmv.ADDED;
                    }
                    if (i == 2) {
                        return C69513Nmv.REMOVED;
                    }
                    if (i == 3) {
                        return C69513Nmv.REPLACED;
                    }
                }
                return C69513Nmv.A03;
            }

            public final Object A0K(Integer num, Object obj, Object obj2) {
                C74232PrL prL;
                switch (num.intValue()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "type_", C71824OrR.A00, "deviceName_"});
                    case 3:
                        return new DeviceChange();
                    case 4:
                        return new NF9();
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        C74232PrL prL2 = PARSER;
                        if (prL2 != null) {
                            return prL2;
                        }
                        synchronized (DeviceChange.class) {
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

        public final class IcdcAlert extends R5b implements C13662TeT {
            public static final IcdcAlert DEFAULT_INSTANCE;
            public static volatile C74232PrL PARSER = null;
            public static final int TYPE_FIELD_NUMBER = 1;
            public int bitField0_;
            public int type_;

            /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.direct.armadilloexpress.memtransporteventpayload.TransportEvent$Event$IcdcAlert, X.R5b] */
            static {
                ? r5b = new R5b();
                DEFAULT_INSTANCE = r5b;
                R5b.A0B(r5b, IcdcAlert.class);
            }

            public final Object A0K(Integer num, Object obj, Object obj2) {
                C74232PrL prL;
                switch (num.intValue()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "type_", C71825OrS.A00});
                    case 3:
                        return new R5b();
                    case 4:
                        return new NFA();
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        C74232PrL prL2 = PARSER;
                        if (prL2 != null) {
                            return prL2;
                        }
                        synchronized (IcdcAlert.class) {
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

        static {
            Event event = new Event();
            DEFAULT_INSTANCE = event;
            R5b.A0B(event, Event.class);
        }

        public final Object A0K(Integer num, Object obj, Object obj2) {
            C74232PrL prL;
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"event_", "eventCase_", "bitField0_", DeviceChange.class, IcdcAlert.class});
                case 3:
                    return new Event();
                case 4:
                    return new NF8();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL2 = PARSER;
                    if (prL2 != null) {
                        return prL2;
                    }
                    synchronized (Event.class) {
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

    public final class Placeholder extends R5b implements C13662TeT {
        public static final Placeholder DEFAULT_INSTANCE;
        public static volatile C74232PrL PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 1;
        public int bitField0_;
        public int type_ = 1;

        static {
            Placeholder placeholder = new Placeholder();
            DEFAULT_INSTANCE = placeholder;
            R5b.A0B(placeholder, Placeholder.class);
        }

        public final Object A0K(Integer num, Object obj, Object obj2) {
            C74232PrL prL;
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "type_", C71826OrT.A00});
                case 3:
                    return new Placeholder();
                case 4:
                    return new NFB();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL2 = PARSER;
                    if (prL2 != null) {
                        return prL2;
                    }
                    synchronized (Placeholder.class) {
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

    static {
        TransportEvent transportEvent = new TransportEvent();
        DEFAULT_INSTANCE = transportEvent;
        R5b.A0B(transportEvent, TransportEvent.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0001\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"content_", "contentCase_", "bitField0_", Placeholder.class, Event.class});
            case 3:
                return new TransportEvent();
            case 4:
                return new NF7();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (TransportEvent.class) {
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
