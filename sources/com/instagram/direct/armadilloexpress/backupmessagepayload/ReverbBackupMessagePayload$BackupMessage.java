package com.instagram.direct.armadilloexpress.backupmessagepayload;

import X.C13662TeT;
import X.C66580MXl;
import X.C74232PrL;
import X.NF3;
import X.NF4;
import X.NF5;
import X.NF6;
import X.R5b;
import X.SQg;
import X.T5L;
import X.TAP;

public final class ReverbBackupMessagePayload$BackupMessage extends R5b implements C13662TeT {
    public static final ReverbBackupMessagePayload$BackupMessage DEFAULT_INSTANCE;
    public static final int ENCRYPTED_TRANSPORT_EVENT_FIELD_NUMBER = 5;
    public static final int ENCRYPTED_TRANSPORT_LOCALLY_TRANSFORMED_MESSAGE_FIELD_NUMBER = 6;
    public static final int ENCRYPTED_TRANSPORT_MESSAGE_FIELD_NUMBER = 2;
    public static final int METADATA_FIELD_NUMBER = 1;
    public static volatile C74232PrL PARSER;
    public int bitField0_;
    public Metadata metadata_;
    public int payloadCase_ = 0;
    public Object payload_;

    public final class Metadata extends R5b implements C13662TeT {
        public static final Metadata DEFAULT_INSTANCE;
        public static final int FRANKING_METADATA_FIELD_NUMBER = 4;
        public static final int FUTUREPROOFBEHAVIOR_FIELD_NUMBER = 6;
        public static final int MESSAGE_ID_FIELD_NUMBER = 2;
        public static volatile C74232PrL PARSER = null;
        public static final int PAYLOADVERSION_FIELD_NUMBER = 5;
        public static final int SENDER_ID_FIELD_NUMBER = 1;
        public static final int THREADTYPETAG_FIELD_NUMBER = 7;
        public static final int TIMESTAMP_MS_FIELD_NUMBER = 3;
        public int bitField0_;
        public FrankingMetadata frankingMetadata_;
        public int futureProofBehavior_;
        public String messageId_ = "";
        public int payloadVersion_;
        public String senderId_ = "";
        public int threadTypeTag_;
        public long timestampMs_;

        public final class FrankingMetadata extends R5b implements C13662TeT {
            public static final FrankingMetadata DEFAULT_INSTANCE;
            public static final int FRANKING_TAG_FIELD_NUMBER = 3;
            public static volatile C74232PrL PARSER = null;
            public static final int REPORTING_TAG_FIELD_NUMBER = 4;
            public int bitField0_;
            public TAP frankingTag_;
            public TAP reportingTag_;

            static {
                FrankingMetadata frankingMetadata = new FrankingMetadata();
                DEFAULT_INSTANCE = frankingMetadata;
                R5b.A0B(frankingMetadata, FrankingMetadata.class);
            }

            public FrankingMetadata() {
                TAP tap = TAP.A01;
                this.frankingTag_ = tap;
                this.reportingTag_ = tap;
            }

            public final Object A0K(Integer num, Object obj, Object obj2) {
                C74232PrL prL;
                switch (num.intValue()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ည\u0000\u0004ည\u0001", new Object[]{"bitField0_", "frankingTag_", "reportingTag_"});
                    case 3:
                        return new FrankingMetadata();
                    case 4:
                        return new NF5();
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        C74232PrL prL2 = PARSER;
                        if (prL2 != null) {
                            return prL2;
                        }
                        synchronized (FrankingMetadata.class) {
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
            Metadata metadata = new Metadata();
            DEFAULT_INSTANCE = metadata;
            R5b.A0B(metadata, Metadata.class);
        }

        public final Object A0K(Integer num, Object obj, Object obj2) {
            C74232PrL prL;
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဉ\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"bitField0_", "senderId_", "messageId_", "timestampMs_", "frankingMetadata_", "payloadVersion_", "futureProofBehavior_", "threadTypeTag_"});
                case 3:
                    return new Metadata();
                case 4:
                    return new NF4();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL2 = PARSER;
                    if (prL2 != null) {
                        return prL2;
                    }
                    synchronized (Metadata.class) {
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

    public final class Subprotocol extends R5b implements C13662TeT {
        public static final Subprotocol DEFAULT_INSTANCE;
        public static volatile C74232PrL PARSER = null;
        public static final int PAYLOAD_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 2;
        public int bitField0_;
        public TAP payload_ = TAP.A01;
        public int version_;

        static {
            Subprotocol subprotocol = new Subprotocol();
            DEFAULT_INSTANCE = subprotocol;
            R5b.A0B(subprotocol, Subprotocol.class);
        }

        public final Object A0K(Integer num, Object obj, Object obj2) {
            C74232PrL prL;
            switch (num.intValue()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002င\u0001", new Object[]{"bitField0_", "payload_", "version_"});
                case 3:
                    return new Subprotocol();
                case 4:
                    return new NF6();
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    C74232PrL prL2 = PARSER;
                    if (prL2 != null) {
                        return prL2;
                    }
                    synchronized (Subprotocol.class) {
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
        ReverbBackupMessagePayload$BackupMessage reverbBackupMessagePayload$BackupMessage = new ReverbBackupMessagePayload$BackupMessage();
        DEFAULT_INSTANCE = reverbBackupMessagePayload$BackupMessage;
        R5b.A0B(reverbBackupMessagePayload$BackupMessage, ReverbBackupMessagePayload$BackupMessage.class);
    }

    public final Object A0K(Integer num, Object obj, Object obj2) {
        C74232PrL prL;
        switch (num.intValue()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                Class<Subprotocol> cls = Subprotocol.class;
                return R5b.A08(DEFAULT_INSTANCE, "\u0001\u0004\u0001\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ွ\u0000\u0005ြ\u0000\u0006ြ\u0000", new Object[]{"payload_", "payloadCase_", "bitField0_", "metadata_", cls, cls});
            case 3:
                return new ReverbBackupMessagePayload$BackupMessage();
            case 4:
                return new NF3();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C74232PrL prL2 = PARSER;
                if (prL2 != null) {
                    return prL2;
                }
                synchronized (ReverbBackupMessagePayload$BackupMessage.class) {
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
