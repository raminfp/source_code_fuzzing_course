// Copyright 2021 Code Intelligence GmbH
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.example;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;

import mil.nga.tiff.TiffReader;
import mil.nga.tiff.util.TiffException;

// Found the issues described in
public class TiffFuzzer {
  public static void fuzzerTestOneInput(byte[] input) {
	try {
		TiffReader.readTiff(input);
	} catch (IllegalStateException | TiffException ignored) {
    	}
	//JSONValue.parse(data.consumeRemainingAsString());
      //JSON.parse(data.consumeRemainingAsString());

  }
}
