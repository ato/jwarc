/*
 * SPDX-License-Identifier: Apache-2.0
 * Copyright (C) 2018 National Library of Australia and the jwarc contributors
 */

package org.netpreserve.jwarc;

public interface WarcRequest extends WarcRecord, HasContentType, HasConcurrentTo, HasPayload, HasTargetURI,
        HasIPAddress {
}